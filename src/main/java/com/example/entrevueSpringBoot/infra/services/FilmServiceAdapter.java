package com.example.entrevueSpringBoot.infra.services;

import com.example.entrevueSpringBoot.application.domain.repo.FilmRepository;
import com.example.entrevueSpringBoot.application.mappers.FilmMapper;
import com.example.entrevueSpringBoot.application.services.FilmService;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceAdapter extends FilmService {
    public FilmServiceAdapter(FilmRepository filmRepository, FilmMapper filmMapper) {
        super(filmRepository, filmMapper);
    }
}
