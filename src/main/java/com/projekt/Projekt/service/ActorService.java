package com.projekt.Projekt.service;

import com.projekt.Projekt.model.Actor;
import com.projekt.Projekt.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ActorService {

    private ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository=actorRepository;
    }
//Wyszukiwanie po  indeksie
    public Optional<Actor> findById (int id){
        return actorRepository.findById(id);
    }
//Wyszukiwanie wszystkich
    public Iterable<Actor> findAll() {
        return actorRepository.findAll();
    }
//Zapisywanie
    public Actor save(Actor actor){
        return actorRepository.save(actor);
    }
//Usuwanie
    public  void deleteById(int id){
        actorRepository.deleteById(id);
    }

    public long count() {
        return actorRepository.count();
    }

}
