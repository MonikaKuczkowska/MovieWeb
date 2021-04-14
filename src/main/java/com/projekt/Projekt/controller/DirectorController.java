package com.projekt.Projekt.controller;

import com.projekt.Projekt.model.Director;
import com.projekt.Projekt.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {

    private DirectorService directors;

    @Autowired
    public DirectorController(DirectorService directors) {
        this.directors = directors;
    }

    @GetMapping("/all")
    public  Iterable<Director> getAll(){
        return directors.findAll();
    }

    @GetMapping
    public Optional<Director> getById(@RequestParam int id) {
        return directors.findById(id);
    }

    @PostMapping
    public Director addDirector(@RequestBody Director director){
        return directors.save(director);
    }

    @PutMapping
    public Director editDirector(@RequestBody Director director){
        return directors.save(director);
    }

    @DeleteMapping
    public void deleteDirector(@RequestParam int id){
        directors.deleteById(id);
    }

    @GetMapping("/count")
    public long counting() {
        return directors.count();
    }
}