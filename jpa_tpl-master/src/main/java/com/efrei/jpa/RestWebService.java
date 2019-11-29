package com.efrei.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efrei.jpa.entity.Person;
import com.efrei.jpa.entity.Rent;
import com.efrei.jpa.entity.Vehicule;
import com.efrei.jpa.repository.PersonRepository;
import com.efrei.jpa.repository.RentRepository;
import com.efrei.jpa.repository.VehiculeRepository;

	@RestController
	public class RestWebService {

		VehiculeRepository vehiculeRepository;
		RentRepository rentRepository;
		PersonRepository personRepository;
		
		@Autowired
		public RestWebService(VehiculeRepository vehiculeRepository, RentRepository rentRepository, PersonRepository personRepository) {
			super();
			this.vehiculeRepository = vehiculeRepository;
			this.rentRepository = rentRepository;
			this.personRepository = personRepository;
		}
		
		@GetMapping("/vehicules")
		public Iterable<Vehicule> getVehicules(){
			return vehiculeRepository.findAll();
		}
		@GetMapping("/rent")
		public Iterable<Rent> getrent(){
			return rentRepository.findAll();
		}
		@GetMapping("/person")
		public Iterable<Person> getperson(){
			return personRepository.findAll();
		}
	}