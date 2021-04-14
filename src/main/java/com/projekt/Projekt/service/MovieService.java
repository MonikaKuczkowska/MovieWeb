package com.projekt.Projekt.service;

import com.projekt.Projekt.model.Actor;
import com.projekt.Projekt.model.Movie;
import com.projekt.Projekt.repository.ActorRepository;
import com.projekt.Projekt.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository=movieRepository;
    }
    //Wyszukiwanie po  indeksie
    public Optional<Movie> findById (int id){
        return movieRepository.findById(id);
    }
    //Wyszukiwanie wszystkich
    public Iterable<Movie> findAll() {
        return movieRepository.findAll();
    }
    //Zapisywanie
    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }
    //Usuwanie
    public  void deleteById(int id){
        movieRepository.deleteById(id);
    }

    public long count() {
        return movieRepository.count();
    }

}
