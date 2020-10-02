package com.davis.springbootpostgresql.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.davis.springbootpostgresql.model.Survey_Answers;
import com.davis.springbootpostgresql.service.Survey_AnswersService;




@Controller
public class Survey_AnswersController  {
	
	@Autowired
	private Survey_AnswersService survey_AnswersService;
	
	//@GetMapping(value = {"/", "index"})
	//public String index (Model model ) {
		//return "index";
		
	//}
	
	@GetMapping("/survey_Answers")
	public String getSurvey_Answers(Model model) {
		List<Survey_Answers> survey_Answers = survey_AnswersService.findAll();
		model.addAttribute("Survey_Answers", survey_Answers);
		return "survey_Answers";
		
		
	}

}
