package com.vicky7230.moviesearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vicky7230.moviesearch.navigation.AppNavGraph
import com.vicky7230.moviesearch.navigation.NavigationProvider
import com.vicky7230.moviesearch.ui.theme.MovieSearchTheme
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieSearchTheme {
                val navController = rememberNavController()
                App(navController, navigationProvider, viewModelFactory)
            }
        }
    }
}

@Composable
fun App(
    navHostController: NavHostController,
    navigationProvider: NavigationProvider,
    viewModelFactory: ViewModelProvider.Factory
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
            .windowInsetsPadding(WindowInsets.navigationBars),
        color = MaterialTheme.colorScheme.background
    ) {
        AppNavGraph(
            navController = navHostController,
            navigationProvider = navigationProvider,
            viewModelFactory = viewModelFactory
        )
    }
}