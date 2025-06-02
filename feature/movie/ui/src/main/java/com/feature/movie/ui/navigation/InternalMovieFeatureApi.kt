package com.feature.movie.ui.navigation

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureApi
import com.feature.movie.ui.screen.MovieScreen
import com.feature.movie.ui.screen.MovieSearchViewModel

internal object InternalMovieFeatureApi : FeatureApi {
    override fun registerGraph(
        navController: NavHostController,
        navGraphBuilder: NavGraphBuilder,
        viewModelFactory: ViewModelProvider.Factory
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieFeature.movieScreenRoute,
            route = MovieFeature.nestedRoute
        ) {
            composable(MovieFeature.movieScreenRoute) { navBackStackEntry ->
                val movieSearchViewModel = viewModel<MovieSearchViewModel>(
                    viewModelStoreOwner = navBackStackEntry,
                    factory = viewModelFactory
                )
                MovieScreen(movieSearchViewModel = movieSearchViewModel, navController = navController)
            }
        }
    }
}