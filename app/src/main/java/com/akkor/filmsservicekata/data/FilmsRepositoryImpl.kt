package com.akkor.filmsservicekata.data

import com.akkor.filmsservicekata.di.AppFactory
import com.akkor.filmsservicekata.domain.FilmsRepository
import com.akkor.filmsservicekata.domain.model.Film
import com.akkor.filmsservicekata.domain.model.FilmResponse

class FilmsRepositoryImpl: FilmsRepository {

    override suspend fun getFilms(): List<Film> {
        val parser = AppFactory.getParser()

        val response = javaClass.classLoader?.getResourceAsStream(
            "FilmsResponse.json"
        ).use { parser.readValue(it, FilmResponse::class.java) }

        return response.films
    }

}