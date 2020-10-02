package com.davis.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.springbootpostgresql.model.Pet;
import com.davis.springbootpostgresql.repository.PetRepository;

@Service
public class PetService {
	
	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> findAll() { 
		List<Pet> pets = petRepository.findAll();
		return pets; 
		
	}
	
	

}
