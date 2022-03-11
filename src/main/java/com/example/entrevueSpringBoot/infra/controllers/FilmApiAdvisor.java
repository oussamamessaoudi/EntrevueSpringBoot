package com.example.entrevueSpringBoot.infra.controllers;

import com.example.entrevueSpringBoot.application.exceptions.FilmNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FilmApiAdvisor {
    @ExceptionHandler(FilmNotFoundException.class)
    public ResponseEntity<String> handleFilmNotFoundExceptionExceptions() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Film introuvable.");
    }
}
