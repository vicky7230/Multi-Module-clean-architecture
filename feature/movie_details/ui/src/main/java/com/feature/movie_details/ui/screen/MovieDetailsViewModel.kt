package com.feature.movie_details.ui.screen

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common.di.AssistedViewModelFactory
import com.feature.movie_details.domain.usecase.GetMovieDetailUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieDetailsViewModel @AssistedInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    private val getMovieDetailsUseCase: GetMovieDetailUseCase
) : ViewModel() {

    private val _movieDetailsUiState =
        MutableStateFlow<MovieDetailsUiState>(MovieDetailsUiState.Idle)
    val movieDetailsUiState = _movieDetailsUiState.asStateFlow()

    @AssistedFactory
    interface Factory : AssistedViewModelFactory<MovieDetailsViewModel> {
        override fun create(savedStateHandle: SavedStateHandle): MovieDetailsViewModel
    }

    init {
        val id = savedStateHandle.get<String>("id")
        id?.let {
            getMovieDetails(it)
        }
    }

    private fun getMovieDetails(id: String) {
        viewModelScope.launch {
            _movieDetailsUiState.value = MovieDetailsUiState.Loading
            try {
                val result = getMovieDetailsUseCase(id, "9a1877d2a04455cb3e3532367ae3265b")
                _movieDetailsUiState.value = MovieDetailsUiState.MovieDetailsLoaded(result)
            } catch (ex: Exception) {
                Log.e("TAG", "Something went wrong", ex)
                _movieDetailsUiState.value = MovieDetailsUiState.Error("Something went wrong")
            }
        }
    }
}
