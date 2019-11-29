package com.efrei.jpa.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.efrei.jpa.entity.Person;
import java.util.*;

@Repository
public interface PersonRepository  extends CrudRepository< Person, Long> {
	List<Person> findByName(String name);
}
