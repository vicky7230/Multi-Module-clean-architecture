package com.feature.movie.ui.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import com.core.common.navigation_constants.MovieDetailsFeature


@Composable
fun MovieScreen(
    modifier: Modifier = Modifier,
    movieSearchViewModel: MovieSearchViewModel,
    navController: NavHostController,
) {
    val uiState by movieSearchViewModel.movieSearchUiState.collectAsStateWithLifecycle()
    val query by movieSearchViewModel.query.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = query,
                onValueChange = {
                    movieSearchViewModel.setQuery(it)
                },
                colors = TextFieldDefaults.colors(
                    disabledIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent
                ),
                placeholder = { Text(text = "Search Movie") },
                trailingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                }
            )
        }
    ) {
        when (val state = uiState) {
            is MovieSearchUiState.Error -> {
                Box(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = state.message)
                }
            }

            is MovieSearchUiState.Idle -> Unit
            is MovieSearchUiState.Loading -> {
                Box(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

            is MovieSearchUiState.MoviesLoaded -> {
                if (state.movies.isEmpty()) {
                    Box(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Nothing found")
                    }
                } else {
                    LazyVerticalGrid(
                        modifier = Modifier.padding(it),
                        columns = GridCells.Adaptive(minSize = 128.dp)
                    ) {
                        items(state.movies) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                                    .border(width = 1.dp, color = Color.White)
                            ) {
                                AsyncImage(
                                    modifier = Modifier.clickable {
                                        navController.navigate("movie_details/${it.id}")
                                    },
                                    model = ImageRequest.Builder(LocalContext.current)
                                        .data(it.imageUrl)
                                        .build(),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    placeholder = rememberVectorPainter(Icons.Default.Refresh),
                                    error = rememberVectorPainter(Icons.Default.Info)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}