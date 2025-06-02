package com.core.network

import com.core.network.model.MovieDetailsDTO
import com.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    //https://api.themoviedb.org/3/search/movie?api_key=9a1877d2a04455cb3e3532367ae3265b&query=app
    @GET("3/search/movie")
    suspend fun getMovieList(
        @Query("api_key") apiKey: String,
        @Query("query") query: String
    ): MovieListResponse

    @GET("3/movie/{id}")
    suspend fun getMovieDetails(
        @Path("id") id: String,
        @Query("api_key") apiKey: String
    ): MovieDetailsDTO
}