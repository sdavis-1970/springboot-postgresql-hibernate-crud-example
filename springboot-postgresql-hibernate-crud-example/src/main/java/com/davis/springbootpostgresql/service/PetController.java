package com.davis.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.davis.springbootpostgresql.model.Pet;

@Controller
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@GetMapping("/pets")
	public String getPets(Model model) {
		List<Pet> pets = petService.findAll();
		model.addAttribute("pets", pets);
		return "pet-list";
			
		
	}


}
