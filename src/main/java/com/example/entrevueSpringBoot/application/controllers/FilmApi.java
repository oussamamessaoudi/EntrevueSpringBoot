package com.example.entrevueSpringBoot.application.controllers;

import com.example.entrevueSpringBoot.application.domain.model.FilmDto;
import com.example.entrevueSpringBoot.application.exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.application.services.FilmService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FilmApi {
    private FilmService filmService;

    public FilmDto createFilm(FilmDto filmDto) {
        return filmService.create(filmDto);

    }

    public FilmDto getFilm(long id) throws FilmNotFoundException {
        return filmService.findFilmById(id);
    }

}
