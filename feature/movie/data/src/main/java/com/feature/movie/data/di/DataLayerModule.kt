package com.feature.movie.data.di

import com.feature.movie.data.repo.MovieRepositoryImpl
import com.feature.movie.domain.repo.MovieRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataLayerModule {

    @Binds
    abstract fun bindMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository
}