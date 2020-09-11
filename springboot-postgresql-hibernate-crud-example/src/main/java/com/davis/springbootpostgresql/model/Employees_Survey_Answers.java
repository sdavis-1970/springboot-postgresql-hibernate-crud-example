package com.davis.springbootpostgresql.model;

import java.math.BigInteger;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees_survey_answers")
public class Employees_Survey_Answers {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) //generates next number for us for a new record
	private long id;
	
	@Id
	@Column(name="emp_id") 
	private long emp_id;
		
	@Column(name="question_id")
	private int question_id;
	
	@Column(name="answer_id")
	private Double answer_id;
	
	@Column(name="employees_survey_answers_id")  
	private BigInteger employees_survey_answers_id;
	
	public Employees_Survey_Answers(Long emp_id, int question_id, Double answer_id, BigInteger employees_survey_answers_id) {
		super();
		this.emp_id = emp_id;
		this.question_id = question_id;
		this.answer_id = answer_id;
		this.employees_survey_answers_id = employees_survey_answers_id;
		
}

	public Employees_Survey_Answers() {
		super();
		// TODO Auto-generated constructor stub
	
		
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public Double getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(Double answer_id) {
		this.answer_id = answer_id;
	}

	public BigInteger getEmployees_survey_answers_id() {
		return employees_survey_answers_id;
	}

	public void setEmployees_survey_answers_id(BigInteger employees_survey_answers_id) {
		this.employees_survey_answers_id = employees_survey_answers_id;
	}

	
	}
