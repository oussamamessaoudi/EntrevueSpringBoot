package com.example.entrevueSpringBoot.infra.repo;

import com.example.entrevueSpringBoot.application.domain.entities.Film;
import com.example.entrevueSpringBoot.application.domain.repo.FilmRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepositoryAdapter extends FilmRepository, CrudRepository<Film, Long> {
}
