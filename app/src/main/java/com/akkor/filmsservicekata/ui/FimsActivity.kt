package com.akkor.filmsservicekata.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.akkor.filmsservicekata.ui.theme.FilmsServiceKataTheme

class MainActivity : ComponentActivity() {

    private val viewModel = FilmsViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmsServiceKataTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FilmList(viewModel = viewModel)
                }
            }
        }
    }
}

@Composable
fun FilmList(viewModel: FilmsViewModel) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp))
    {
        items(viewModel.films) {
            Film(it.title)
        }
    }
}

@Composable
fun Film(name: String) {
    Text(
        modifier = Modifier.padding(top = 8.dp),
        text = name
    )
}
