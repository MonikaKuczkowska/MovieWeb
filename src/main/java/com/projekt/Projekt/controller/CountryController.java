package com.projekt.Projekt.controller;

import com.projekt.Projekt.model.Country;
import com.projekt.Projekt.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private CountryService countries;

    @Autowired
    public CountryController(CountryService genres) {
        this.countries = countries;
    }

    @GetMapping("/all")
    public  Iterable<Country> getAll(){
        return countries.findAll();
    }

    @GetMapping
    public Optional<Country> getById(@RequestParam int id) {
        return countries.findById(id);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country){
        return countries.save(country);
    }

    @PutMapping
    public Country editCountry(@RequestBody Country country){
        return countries.save(country);
    }

    @DeleteMapping
    public void deleteCountry(@RequestParam int id){
        countries.deleteById(id);
    }

    @GetMapping("/count")
    public long counting() {
        return countries.count();
    }
}
