package com.projekt.Projekt.repository;

import com.projekt.Projekt.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
