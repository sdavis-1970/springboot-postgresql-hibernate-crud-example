package com.davis.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class Pet {
	
	@Id
	@GeneratedValue(generator="pets_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(
			name = "pets_id_seq",
			sequenceName="pets_id_seq",
			allocationSize=1
			)
	private Long pet_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="species")
	private String species;
	
	@Column(name="age")
	private int age;
	
	@Column(name="bites")
	private boolean bites;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public Pet(String name, String species, int age, boolean bites, Employee employee) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		this.bites = bites;
		this.employee = employee;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPet_id() {
		return pet_id;
	}

	public void setPet_id(Long pet_id) {
		this.pet_id = pet_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBites() {
		return bites;
	}

	public void setBites(boolean bites) {
		this.bites = bites;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
	

}
