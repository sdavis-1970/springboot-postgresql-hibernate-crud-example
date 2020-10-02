package com.davis.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.springbootpostgresql.model.Employees_Survey_Answers;
import com.davis.springbootpostgresql.repository.Employees_Survey_AnswersRepository;

@Service
public class Employees_Survey_AnswersService {
	
	@Autowired
	private Employees_Survey_AnswersRepository employees_Survey_AnswersRepository;
	
	
	public List<Employees_Survey_Answers> findAll() {
		List<Employees_Survey_Answers> employees_Survey_Answers = employees_Survey_AnswersRepository.findAll();
		return employees_Survey_Answers;
		
	}
}
