package com.projekt.Projekt.service;

import com.projekt.Projekt.model.Country;
import com.projekt.Projekt.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository genreRepository) {
        this.countryRepository=genreRepository;
    }
    //Wyszukiwanie po  indeksie
    public Optional<Country> findById (int id){
        return countryRepository.findById(id);
    }
    //Wyszukiwanie wszystkich
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }
    //Zapisywanie
    public Country save(Country country){
        return countryRepository.save(country);
    }
    //Usuwanie
    public  void deleteById(int id){
        countryRepository.deleteById(id);
    }

    public long count() {
        return countryRepository.count();
    }

}
