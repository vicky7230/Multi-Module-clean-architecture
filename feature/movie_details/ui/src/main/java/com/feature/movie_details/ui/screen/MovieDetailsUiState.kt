package com.feature.movie_details.ui.screen

import com.feature.movie_details.domain.model.MovieDetails

sealed class MovieDetailsUiState {
    data object Idle : MovieDetailsUiState()
    data object Loading : MovieDetailsUiState()
    data class Error(val message: String) : MovieDetailsUiState()
    data class MovieDetailsLoaded(val movieDetails: MovieDetails) : MovieDetailsUiState()
}