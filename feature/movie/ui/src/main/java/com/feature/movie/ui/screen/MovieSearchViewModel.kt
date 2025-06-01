package com.feature.movie.ui.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.feature.movie.domain.usecases.GetMovieListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import javax.inject.Inject


class MovieSearchViewModel @Inject constructor(
    private val getMovieListUseCase: GetMovieListUseCase
) : ViewModel() {

    private val _movieSearchUiState: MutableStateFlow<MovieSearchUiState> =
        MutableStateFlow(MovieSearchUiState.Idle)
    val movieSearchUiState = _movieSearchUiState.asStateFlow()

    private val _query = MutableStateFlow("")
    val query = _query.asStateFlow()

    fun setQuery(s: String) {
        _query.value = s
    }

    init {
        instantSearch()
    }

    @OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
    private fun instantSearch() {
        _query
            .debounce(300)
            .filter { it.isNotEmpty() && it.length > 2 }
            .distinctUntilChanged()
            .flatMapLatest { query ->
                flow {
                    _movieSearchUiState.value = MovieSearchUiState.Loading
                    try {
                        val result = getMovieListUseCase("9a1877d2a04455cb3e3532367ae3265b", query)
                        _movieSearchUiState.value = MovieSearchUiState.MoviesLoaded(result)
                    } catch (e: Exception) {
                        Log.e("TAG", e.message ?: "")
                        _movieSearchUiState.value = MovieSearchUiState.Error("Something went wrong")
                    }
                    emit(Unit) // dummy emit, not really used
                }
            }
            .flowOn(Dispatchers.IO)
            .launchIn(viewModelScope)
    }


}