package com.feature.movie.ui.screen

import com.feature.movie.domain.model.Movie

sealed interface MovieSearchUiState {
    data object Idle : MovieSearchUiState
    data object Loading : MovieSearchUiState
    data class Error(val message: String) : MovieSearchUiState
    data class MoviesLoaded(val movies: List<Movie>) : MovieSearchUiState
}