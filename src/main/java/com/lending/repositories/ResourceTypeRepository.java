package com.lending.repositories;

import com.lending.entities.ResourceType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceTypeRepository extends CrudRepository<ResourceType, Integer> {
}