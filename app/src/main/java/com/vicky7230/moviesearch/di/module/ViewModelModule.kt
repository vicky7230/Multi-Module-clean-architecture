package com.vicky7230.moviesearch.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.feature.movie.ui.screen.MovieSearchViewModel
import com.vicky7230.moviesearch.di.ViewModelFactory

import com.vicky7230.moviesearch.di.ViewModelKey


import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MovieSearchViewModel::class)
    abstract fun bindMovieSearchViewModel(movieSearchViewModel: MovieSearchViewModel): ViewModel

}