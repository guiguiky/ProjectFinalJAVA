package com.efrei.jpa.repository;


import java.util.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.efrei.jpa.entity.Rent;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
}