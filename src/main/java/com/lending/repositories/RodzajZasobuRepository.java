package com.lending.repositories;

import com.lending.entities.RodzajZasobu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RodzajZasobuRepository extends CrudRepository<RodzajZasobu, Integer> {
}
