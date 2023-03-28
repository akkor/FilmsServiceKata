package com.akkor.filmsservicekata.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akkor.filmsservicekata.domain.model.Film
import kotlinx.coroutines.launch

class FilmsViewModel : ViewModel() {

    var films = emptyList<Film>()

    init {
        viewModelScope.launch {
            // TODO: Call use case
        }
    }
}
