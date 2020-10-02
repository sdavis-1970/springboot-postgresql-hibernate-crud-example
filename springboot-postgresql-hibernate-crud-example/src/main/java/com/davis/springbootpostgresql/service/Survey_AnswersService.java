package com.davis.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davis.springbootpostgresql.model.Survey_Answers;
import com.davis.springbootpostgresql.repository.Survey_AnswersRepository;

@Service
public class Survey_AnswersService {
	
@Autowired
private Survey_AnswersRepository survey_AnswersRepository;


public List<Survey_Answers> findAll() {
	List<Survey_Answers> survey_Answers = survey_AnswersRepository.findAll();
	return survey_Answers;
	

	
	}

}
