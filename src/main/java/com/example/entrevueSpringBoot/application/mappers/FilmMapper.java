package com.example.entrevueSpringBoot.application.mappers;

import com.example.entrevueSpringBoot.application.domain.entities.Film;
import com.example.entrevueSpringBoot.application.domain.model.FilmDto;

public interface FilmMapper {
    Film mapDtoToEntity(FilmDto filmDto);
    FilmDto mapEntityToDto(Film film);
}
