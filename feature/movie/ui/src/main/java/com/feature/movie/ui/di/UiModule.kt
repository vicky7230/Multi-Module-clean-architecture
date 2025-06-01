package com.feature.movie.ui.di

import com.feature.movie.ui.navigation.MovieApi
import com.feature.movie.ui.navigation.MovieApiImpl
import dagger.Binds
import dagger.Module

@Module
abstract class UiModule {
    @Binds
    abstract fun bindMovieApi(movieApiImpl: MovieApiImpl): MovieApi
}