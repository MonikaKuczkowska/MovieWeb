package com.projekt.Projekt.controller;

import com.projekt.Projekt.model.Genre;
import com.projekt.Projekt.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private GenreService genres;

    @Autowired
    public GenreController(GenreService genres) {
        this.genres = genres;
    }

    @GetMapping("/all")
    public  Iterable<Genre> getAll(){
        return genres.findAll();
    }

    @GetMapping
    public Optional<Genre> getById(@RequestParam int id) {
        return genres.findById(id);
    }

    @PostMapping
    public Genre addGenre(@RequestBody Genre genre){
        return genres.save(genre);
    }

    @PutMapping
    public Genre editGenre(@RequestBody Genre genre){
        return genres.save(genre);
    }

    @DeleteMapping
    public void deleteGenre(@RequestParam int id){
        genres.deleteById(id);
    }

    @GetMapping("/count")
    public long counting() {
        return genres.count();
    }
}