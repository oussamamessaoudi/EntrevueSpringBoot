package com.example.entrevueSpringBoot.application.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Acteur {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Acteur acteur = (Acteur) o;

        if (id != null ? !id.equals(acteur.id) : acteur.id != null) return false;
        if (nom != null ? !nom.equals(acteur.nom) : acteur.nom != null) return false;
        return prenom != null ? prenom.equals(acteur.prenom) : acteur.prenom == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
