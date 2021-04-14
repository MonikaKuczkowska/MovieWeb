package com.projekt.Projekt.controller;

import com.projekt.Projekt.model.Movie;
import com.projekt.Projekt.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private MovieService movies;

    @Autowired
    public MovieController(MovieService movies) {
        this.movies = movies;
    }

    @GetMapping("/all")
    public  Iterable<Movie> getAll(){
        return movies.findAll();
    }

    @GetMapping
    public Optional<Movie> getById(@RequestParam int id) {
        return movies.findById(id);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movies.save(movie);
    }

    @PutMapping
    public Movie editMovie(@RequestBody Movie movie){
        return movies.save(movie);
    }

    @DeleteMapping
    public void deleteMovie(@RequestParam int id){
        movies.deleteById(id);
    }

    @GetMapping("/count")
    public long counting() {
        return movies.count();
    }
}
