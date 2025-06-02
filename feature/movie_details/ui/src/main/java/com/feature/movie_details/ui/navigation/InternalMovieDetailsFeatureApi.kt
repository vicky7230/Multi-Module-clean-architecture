package com.feature.movie_details.ui.navigation

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieDetailsFeature
import com.core.feature_api.FeatureApi
import com.feature.movie_details.ui.screen.MovieDetailsScreen
import com.feature.movie_details.ui.screen.MovieDetailsViewModel

internal object InternalMovieDetailsFeatureApi : FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
        viewModelFactory: ViewModelProvider.Factory
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieDetailsFeature.movieDetailsSCreenRoute,
            route = MovieDetailsFeature.nestedRoute
        ) {
            composable(MovieDetailsFeature.movieDetailsSCreenRoute) { navBackStackEntry ->
                val id = navBackStackEntry.arguments?.getString("id")
                val movieDetailsViewModel = viewModel<MovieDetailsViewModel>(
                    viewModelStoreOwner = navBackStackEntry,
                    factory = viewModelFactory
                )
                MovieDetailsScreen(id = id ?: "", movieDetailsViewModel = movieDetailsViewModel)
            }
        }
    }
}