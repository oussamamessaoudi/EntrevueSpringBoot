package com.example.entrevueSpringBoot.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActeurDto {
    private Long id;
    private String prenom;
    private String nom;
}