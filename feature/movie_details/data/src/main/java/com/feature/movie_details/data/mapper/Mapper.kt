package com.feature.movie_details.data.mapper

import com.core.network.model.MovieDetailsDTO
import com.feature.movie_details.domain.model.MovieDetails

fun MovieDetailsDTO.toDomain(): MovieDetails {
    return MovieDetails(
        title = this.title,
        desc = this.overview,
        imageUrl = "https://image.tmdb.org/t/p/w500${this.poster_path}"
    )
}