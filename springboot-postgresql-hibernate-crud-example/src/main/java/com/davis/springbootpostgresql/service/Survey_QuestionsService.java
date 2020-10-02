package com.davis.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.springbootpostgresql.model.Survey_Questions;
import com.davis.springbootpostgresql.repository.Survey_QuestionsRepository;

@Service
public class Survey_QuestionsService  {
	
	@Autowired
	private Survey_QuestionsRepository survey_QuestionsRepository;
	

	public List<Survey_Questions> findAll() {
		List<Survey_Questions> survey_Questions = survey_QuestionsRepository.findAll();
		return survey_Questions;
		
	}
	
	
}
