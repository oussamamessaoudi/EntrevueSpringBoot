package com.example.entrevueSpringBoot.application.mappers;

import com.example.entrevueSpringBoot.application.domain.entities.Acteur;
import com.example.entrevueSpringBoot.application.domain.model.ActeurDto;

public interface ActeurMapper {
    Acteur mapDtoToEntity(ActeurDto acteurDto);
    ActeurDto mapEntityToDto(Acteur acteur);
}
