package com.projekt.Projekt.controller;

import com.projekt.Projekt.model.Actor;
import com.projekt.Projekt.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    private ActorService actors;

    @Autowired
    public ActorController(ActorService actors) {
        this.actors = actors;
    }

    @GetMapping("/all")
    public  Iterable<Actor> getAll(){
        return actors.findAll();
    }

    @GetMapping
    public Optional<Actor> getById(@RequestParam int id) {
        return actors.findById(id);
    }

    @PostMapping
    public Actor addActor(@RequestBody Actor actor){
        return actors.save(actor);
    }

    @PutMapping
    public Actor editActor(@RequestBody Actor actor){
        return actors.save(actor);
    }

    @DeleteMapping
    public void deleteActor(@RequestParam int id){
        actors.deleteById(id);
    }

    @GetMapping("/count")
    public long counting() {
        return actors.count();
    }
}