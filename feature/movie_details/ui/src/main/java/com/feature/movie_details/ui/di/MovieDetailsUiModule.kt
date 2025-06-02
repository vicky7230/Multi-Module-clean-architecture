package com.feature.movie_details.ui.di

import com.feature.movie_details.ui.navigation.MovieDetailsApi
import com.feature.movie_details.ui.navigation.MovieDetailsApiImpl
import dagger.Binds
import dagger.Module

@Module
abstract class MovieDetailsUiModule {

    @Binds
    abstract fun bindMovieDetailsApi(movieDetailsApiImpl: MovieDetailsApiImpl): MovieDetailsApi
}