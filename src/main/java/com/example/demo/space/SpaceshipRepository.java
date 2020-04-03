package com.example.demo.space;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="rumskibe")
public interface SpaceshipRepository extends PagingAndSortingRepository<Spaceship, Integer> {
}
