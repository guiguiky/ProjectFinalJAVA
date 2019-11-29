package com.efrei.jpa.entity;

import java.util.ArrayList;
import javax.persistence.*;





@Entity
public abstract class Vehicule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	protected String plateNumber;
	protected ArrayList<Rent> rent = new ArrayList<>();
	
	public Vehicule() {
		super();
	}
	
	public Vehicule(String plateNumber) {
		super();
		this.setPlateNumber(plateNumber); 
	}

	
	@OneToMany(mappedBy="vehicule", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	public ArrayList<Rent> getRent() {
		return rent;
	}
	public void setRent(ArrayList<Rent> rent) {
		this.rent = rent;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
}
