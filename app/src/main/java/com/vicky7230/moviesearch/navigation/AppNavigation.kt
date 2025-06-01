package com.vicky7230.moviesearch.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.core.common.navigation_constants.MovieFeature

@Composable
fun AppNavGraph(
    navController: NavHostController,
    navigationProvider: NavigationProvider,
    viewModelFactory: ViewModelProvider.Factory
) {
    NavHost(navController = navController, startDestination = MovieFeature.nestedRoute) {
        navigationProvider.movieApi.registerGraph(navController, this, viewModelFactory)
    }
}