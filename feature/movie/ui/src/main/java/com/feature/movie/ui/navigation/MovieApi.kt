package com.feature.movie.ui.navigation

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureApi
import javax.inject.Inject

interface MovieApi : FeatureApi

class MovieApiImpl @Inject constructor() : MovieApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
        viewModelFactory: ViewModelProvider.Factory
    ) {
        InternalMovieFeatureApi.registerGraph(navController, navGraphBuilder, viewModelFactory)
    }
}