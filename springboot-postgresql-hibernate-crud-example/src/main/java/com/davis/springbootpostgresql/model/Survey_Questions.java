package com.davis.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="survey_questions")
public class Survey_Questions {
	
	
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //generates next number for us for a new record 
	private int questionid;
		
	@Column(name="question")
	private int question;

	public Survey_Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Survey_Questions(int questionid, int question) {
		super();
		this.questionid = questionid;
		this.question = question;
	}


	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}
	

}
