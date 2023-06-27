package com.example.exercise1garagecrud.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Carsrepository extends JpaRepository <Car, Long>{
}
