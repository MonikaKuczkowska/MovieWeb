package com.projekt.Projekt.repository;
import com.projekt.Projekt.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {
    public long countByName(String name);
}
