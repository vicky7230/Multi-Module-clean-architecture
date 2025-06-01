package com.feature.movie.data.repo

import com.core.network.dataproviders.MovieDataProviders
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val dataProviders: MovieDataProviders
) : MovieRepository {
    override suspend fun getMovieList(apiKey: String, query: String): List<Movie> {
        return dataProviders.getMovieList(apiKey, query).toDomainMovieList()
    }
}