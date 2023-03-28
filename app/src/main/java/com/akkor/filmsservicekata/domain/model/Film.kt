package com.akkor.filmsservicekata.domain.model

data class FilmResponse(
    val films: List<Film>
)

data class Film(
    val actors: String,
    val director: String,
    val genres: List<String>,
    val id: Int,
    val summary: String,
    val posterUrl: String,
    val average: Double,
    val title: String,
    val year: String
)