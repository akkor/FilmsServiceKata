package com.akkor.filmsservicekata.domain

import com.akkor.filmsservicekata.domain.model.Film

interface FilmsRepository {
    suspend fun getFilms(): List<Film>
}