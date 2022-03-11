package com.example.entrevueSpringBoot.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto {
    private Long id;
    private String titre;
    private String description;
    private Set<ActeurDto> acteurs;
}
