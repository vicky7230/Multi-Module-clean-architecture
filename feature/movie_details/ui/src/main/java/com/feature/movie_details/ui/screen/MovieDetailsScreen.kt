package com.feature.movie_details.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil3.compose.AsyncImage
import coil3.request.ImageRequest

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieDetailsScreen(
    modifier: Modifier = Modifier,
    id: String,
    movieDetailsViewModel: MovieDetailsViewModel
) {
    val uiState = movieDetailsViewModel.movieDetailsUiState.collectAsStateWithLifecycle()
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Movie Details") })
        }
    ) {
        when (val state = uiState.value) {
            is MovieDetailsUiState.Error -> {
                Box(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = state.message)
                }
            }

            MovieDetailsUiState.Idle -> {

            }

            MovieDetailsUiState.Loading -> {
                Box(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }

            is MovieDetailsUiState.MovieDetailsLoaded -> {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(state.movieDetails.imageUrl).build(),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = state.movieDetails.title,
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(
                                text = state.movieDetails.desc,
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }
                }
            }
        }
    }
}