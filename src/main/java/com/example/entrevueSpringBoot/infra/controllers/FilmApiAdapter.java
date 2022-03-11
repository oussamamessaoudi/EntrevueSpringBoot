package com.example.entrevueSpringBoot.infra.controllers;

import com.example.entrevueSpringBoot.application.controllers.FilmApi;
import com.example.entrevueSpringBoot.application.domain.model.FilmDto;
import com.example.entrevueSpringBoot.application.exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.application.services.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/film")
public class FilmApiAdapter extends FilmApi {
    public FilmApiAdapter(FilmService filmService) {
        super(filmService);
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FilmDto createFilm(@RequestBody FilmDto filmDto) {
        return super.createFilm(filmDto);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FilmDto getFilm(@PathVariable long id) throws FilmNotFoundException {
        return super.getFilm(id);
    }
}
