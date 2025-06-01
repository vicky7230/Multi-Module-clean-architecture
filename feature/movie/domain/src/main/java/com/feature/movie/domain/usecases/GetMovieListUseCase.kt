package com.feature.movie.domain.usecases

import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    suspend operator fun invoke(apiKey: String, query: String): List<Movie> {
        return movieRepository.getMovieList(apiKey, query)
    }
}