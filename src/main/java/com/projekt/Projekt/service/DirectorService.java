package com.projekt.Projekt.service;

import com.projekt.Projekt.model.Director;
import com.projekt.Projekt.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DirectorService {

    private DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository=directorRepository;
    }
    //Wyszukiwanie po  indeksie
    public Optional<Director> findById (int id){
        return directorRepository.findById(id);
    }
    //Wyszukiwanie wszystkich
    public Iterable<Director> findAll() {
        return directorRepository.findAll();
    }
    //Zapisywanie
    public Director save(Director director){
        return directorRepository.save(director);
    }
    //Usuwanie
    public  void deleteById(int id){
        directorRepository.deleteById(id);
    }

    public long count() {
        return directorRepository.count();
    }

}
