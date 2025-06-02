package com.vicky7230.moviesearch.di.module

import com.feature.movie.ui.navigation.MovieApi
import com.feature.movie_details.ui.navigation.MovieDetailsApi
import com.vicky7230.moviesearch.navigation.NavigationProvider
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: MovieApi, movieDetailsApi: MovieDetailsApi): NavigationProvider {
        return NavigationProvider(movieApi, movieDetailsApi)
    }
}