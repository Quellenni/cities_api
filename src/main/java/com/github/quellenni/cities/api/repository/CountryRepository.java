package com.github.quellenni.cities.api.repository;

import com.github.quellenni.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
