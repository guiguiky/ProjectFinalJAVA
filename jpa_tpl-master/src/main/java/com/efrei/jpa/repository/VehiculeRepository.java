package com.efrei.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.efrei.jpa.entity.Vehicule;
//import java.util.*;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
    Vehicule findByPlateNumber(String plateNumber);
}