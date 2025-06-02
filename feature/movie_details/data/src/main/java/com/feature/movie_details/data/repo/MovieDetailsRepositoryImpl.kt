package com.feature.movie_details.data.repo

import com.core.network.dataproviders.MovieDataProviders
import com.feature.movie_details.data.mapper.toDomain
import com.feature.movie_details.domain.model.MovieDetails
import com.feature.movie_details.domain.repo.MovieDetailsRepository
import javax.inject.Inject

class MovieDetailsRepositoryImpl @Inject constructor(
    private val dataProviders: MovieDataProviders
) : MovieDetailsRepository {
    override suspend fun getMovieDetails(id: String, apiKey: String): MovieDetails {
        return dataProviders.getMovieDetails(id, apiKey).toDomain()
    }
}