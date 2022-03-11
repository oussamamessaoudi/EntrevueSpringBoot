package com.example.entrevueSpringBoot.application.services;

import com.example.entrevueSpringBoot.application.domain.entities.Film;
import com.example.entrevueSpringBoot.application.domain.model.FilmDto;
import com.example.entrevueSpringBoot.application.domain.repo.FilmRepository;
import com.example.entrevueSpringBoot.application.exceptions.FilmNotFoundException;
import com.example.entrevueSpringBoot.application.mappers.FilmMapper;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class FilmService {
    private FilmRepository filmRepository;
    private FilmMapper filmMapper;

    public FilmDto create(FilmDto filmDto) {
        return filmMapper.mapEntityToDto(filmRepository.save(filmMapper.mapDtoToEntity(filmDto)));
    }

    public FilmDto findFilmById(long id) throws FilmNotFoundException {
        Optional<Film> film = filmRepository.findById(id);
        return film.map(filmMapper::mapEntityToDto).orElseThrow(FilmNotFoundException::new);
    }

}
