package com.efrei.jpa.entity;

import java.util.ArrayList;

import javax.persistence.*;

//import org.hibernate.mapping.Collection;
//import org.springframework.lang.NonNull;
//import java.util.;

@Entity
public class Person {
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", rent=" + rent + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@NonNull
	private String name;
	private ArrayList<Rent> rent = new ArrayList<>();
	
	@OneToMany
	(targetEntity = Rent.class, mappedBy = "Person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public ArrayList<Rent> getRent() {
		return rent;
	}

	public void setRent(ArrayList<Rent> rent) {
		this.rent = rent;
	}
	public Person() {
	}
	
	public Person(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Long getid() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
