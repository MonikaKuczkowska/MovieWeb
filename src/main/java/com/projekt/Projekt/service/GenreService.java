package com.projekt.Projekt.service;

import com.projekt.Projekt.model.Genre;
import com.projekt.Projekt.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GenreService {

    private GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository=genreRepository;
    }
    //Wyszukiwanie po  indeksie
    public Optional<Genre> findById (int id){
        return genreRepository.findById(id);
    }
    //Wyszukiwanie wszystkich
    public Iterable<Genre> findAll() {
        return genreRepository.findAll();
    }
    //Zapisywanie
    public Genre save(Genre genre){
        return genreRepository.save(genre);
    }
    //Usuwanie
    public  void deleteById(int id){
        genreRepository.deleteById(id);
    }

    public long count() {
        return genreRepository.count();
    }


}
