package com.arnaldo.citiesapi.repository;

import com.arnaldo.citiesapi.countries.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
}
