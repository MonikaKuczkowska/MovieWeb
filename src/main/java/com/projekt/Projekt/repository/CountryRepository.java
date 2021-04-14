package com.projekt.Projekt.repository;

import com.projekt.Projekt.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
