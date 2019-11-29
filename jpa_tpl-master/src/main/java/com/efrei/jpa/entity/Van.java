package com.efrei.jpa.entity;

import javax.persistence.*;

@Entity
public class Van extends Vehicule {
	
	private double maxWeight;
	
	protected Van() {
		super();
	}
	
	public Van(String plateNumber, double maxWeight) {
		
		super(plateNumber);
		this.maxWeight = maxWeight;
	}
	
	public Van(String plateNumber, Rent rent, double maxWeight) {
		
		super(plateNumber);
		this.maxWeight = maxWeight;
	}
	
	public double getMaxWeight() {
		
		return maxWeight; 
	}
	
	public void setMaxWeight(double maxWeight) {
		
		this.maxWeight = maxWeight;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		return null;
	}
	

}
