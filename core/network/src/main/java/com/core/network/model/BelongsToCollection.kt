package com.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class BelongsToCollection(
    val backdrop_path: String? =null,
    val id: Int,
    val name: String,
    val poster_path: String
)