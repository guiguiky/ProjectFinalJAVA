package com.efrei.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.efrei.jpa.entity.Car;
import com.efrei.jpa.entity.Person;
import com.efrei.jpa.entity.Rent;
import com.efrei.jpa.entity.Van;
import com.efrei.jpa.entity.Vehicule;
import com.efrei.jpa.repository.PersonRepository;
import com.efrei.jpa.repository.RentRepository;
import com.efrei.jpa.repository.VehiculeRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JpaApplication {

	
	private static final Logger log = LoggerFactory.getLogger(JpaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    
    @Bean
    //TODO: add necessary repositories as parameters and they will be autowired
 
    public CommandLineRunner demo(PersonRepository repository, VehiculeRepository repository2, RentRepository repository3) {
        return (args) -> {	
        	
        	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = dateFormat.parse("2019-11-20");
			log.info(date.toString());
			
			Date dateRetour = dateFormat.parse("2018-11-29");
			log.info(dateRetour.toString());
			
			Car Ferrari = new Car("AA22BB",5);
			Car Fiat = new Car("AA11AA",5);
			Car FiatTipo = new Car("BB34CC",5);
			
			Ferrari = repository2.save(Ferrari);
			Fiat = repository2.save(Fiat);
			FiatTipo = repository2.save(FiatTipo); 
			
			Person Guillaume = new Person("Guillaume", 19);
			Person Tristan = new Person("Tristan",31);
			Person Randy = new Person("Randy",32);

			
			Guillaume = repository.save(Guillaume);
			Tristan = repository.save(Tristan);
			Randy = repository.save(Randy);

			
			Rent location = new Rent(date, dateRetour, Guillaume, Ferrari);
			Rent Location2 = new Rent(date, dateRetour, Tristan, Fiat);
			Rent Location3 = new Rent(date, dateRetour, Randy, FiatTipo);

			location = repository3.save(location);
			Location2 = repository3.save(Location2);
			Location3 = repository3.save(Location3);

			
		
};
}}
