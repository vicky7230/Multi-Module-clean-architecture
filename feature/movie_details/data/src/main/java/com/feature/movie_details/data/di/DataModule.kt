package com.feature.movie_details.data.di

import com.feature.movie_details.data.repo.MovieDetailsRepositoryImpl
import com.feature.movie_details.domain.repo.MovieDetailsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindMovieDetailsRepository(movieDetailsRepositoryImpl: MovieDetailsRepositoryImpl): MovieDetailsRepository
}