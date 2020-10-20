package com.davis.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.davis.springbootpostgresql.model.Employees_Survey_Answers;
import com.davis.springbootpostgresql.service.Employees_Survey_AnswersService;

@Controller
public class Employees_Survey_AnswersController {
	
  @Autowired
  private Employees_Survey_AnswersService employees_Survey_AnswersService;
  
  //@GetMapping(value = {"/", "index"})
  //public String index (Model model) {
	 //return "index";
	 
  //}
	
@GetMapping("/employees_survey_answers")
public String getEmployees_Survey_Answers(Model model) {
	List<Employees_Survey_Answers> employees_survey_answers = employees_Survey_AnswersService.findAll();
	model.addAttribute("employees_survey_answers", employees_survey_answers); //shows what UI will display
	return "employees_survey_answers";
	
}

}
