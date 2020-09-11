package com.davis.springbootpostgresql.model;

import java.lang.Object;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) //generates next number for us for a new record
	private long id;
	
	@Id
	@Column(name="emp_id") 
	private long emp_id;
		
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
	

	public Employee(Long emp_id, String first_name, String last_name, String title, String email_address, Date hire_date) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.title = title;
		this.email_address = email_address;
		this.hire_date = hire_date;
		
	}

	public long getEmp_Id() {
		return emp_id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmp_Id(long emp_id) {
		this.emp_id = emp_id;
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
	
	

}
