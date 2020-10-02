package com.davis.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davis.springbootpostgresql.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
