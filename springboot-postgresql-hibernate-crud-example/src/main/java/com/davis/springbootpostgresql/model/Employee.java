package com.davis.springbootpostgresql.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import BAK.Pet;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@Id
	//@GeneratedValue(generator="employees_id_seq", strategy=GenerationType.SEQUENCE)
	//@Column(name="id")
	//private Long id;
		
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="title")  
	private String title;
	
	@Column(name="email_address") 
	private String email_address;
	
	@Column(name="hire_date")
	private Date hire_date;
	
	//@OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Pet.class)
	//private List<Pet> pets;
	
	//@OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.EAGER, targetEntity=Employees_Survey_Answers.class)
	//private List<Employees_Survey_Answers> employees_survey_answers;

	public Employee(Long id, String first_name, String last_name, String title, String email_address, Date hire_date) {
		super();
		//this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.title = title;
		this.email_address = email_address;
		this.hire_date = hire_date;
		
	//}

	//public List<Employees_Survey_Answers> getEmployees_survey_answers() {
		//return employees_survey_answers;
	//}

	//public void setEmployees_survey_answers(List<Employees_Survey_Answers> employees_survey_answers) {
		//this.employees_survey_answers = employees_survey_answers;
	}

	public Long getId() {
		return id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
    public Date getHire_date() {
	return hire_date;
    }
    public void setHire_date(Date hire_date) {
    	this.hire_date = hire_date;
    	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	//}

	//public List<Pet> getPets() {
		//if(this.pets == null) {
			//this.pets = new ArrayList<Pet>();
		//}
		//return this.pets;
	//}

	//public void setPets(List<Pet> pets) {
		//this.pets = pets;
	}


	

}
