package com.arnaldo.citiesapi.repository;

import java.util.List;

import com.arnaldo.citiesapi.countries.Country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/countries")
public class CountryResource {

    
    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
       this.repository = repository;
    }


    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }

}
