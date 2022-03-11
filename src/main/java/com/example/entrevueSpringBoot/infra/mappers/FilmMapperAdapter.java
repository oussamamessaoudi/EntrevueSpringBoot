package com.example.entrevueSpringBoot.infra.mappers;

import com.example.entrevueSpringBoot.application.mappers.FilmMapper;
import org.mapstruct.Mapper;

@Mapper(uses = ActeurMapperAdapter.class)
public interface FilmMapperAdapter extends FilmMapper {
}
