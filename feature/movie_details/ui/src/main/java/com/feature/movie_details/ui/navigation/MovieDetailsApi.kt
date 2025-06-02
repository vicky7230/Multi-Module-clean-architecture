package com.feature.movie_details.ui.navigation

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureApi
import javax.inject.Inject

interface MovieDetailsApi : FeatureApi

class MovieDetailsApiImpl @Inject constructor() : MovieDetailsApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
        viewModelFactory: ViewModelProvider.Factory
    ) {
        InternalMovieDetailsFeatureApi.registerGraph(
            navController,
            navGraphBuilder,
            viewModelFactory
        )
    }
}