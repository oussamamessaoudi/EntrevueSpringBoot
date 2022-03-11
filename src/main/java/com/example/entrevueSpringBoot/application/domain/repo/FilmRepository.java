package com.example.entrevueSpringBoot.application.domain.repo;

import com.example.entrevueSpringBoot.application.domain.entities.Film;

import java.util.Optional;

public interface FilmRepository {
    Film save(Film entity);

    Optional<Film> findById(Long id);

    boolean existsById(Long id);
}
