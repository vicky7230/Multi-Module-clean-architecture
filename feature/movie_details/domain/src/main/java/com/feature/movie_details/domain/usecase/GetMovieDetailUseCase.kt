package com.feature.movie_details.domain.usecase

import com.feature.movie_details.domain.model.MovieDetails
import com.feature.movie_details.domain.repo.MovieDetailsRepository
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(
    private val movieDetailsRepository: MovieDetailsRepository
) {
    suspend operator fun invoke(id: String, apiKey: String): MovieDetails {
        return movieDetailsRepository.getMovieDetails(id, apiKey)
    }
}