package com.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieListResponse(
    val page: Int,
    val results: List<MovieDTO>,
    val total_pages: Int,
    val total_results: Int
)