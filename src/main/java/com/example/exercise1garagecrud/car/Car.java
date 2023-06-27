package com.example.exercise1garagecrud.car;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String models;
    private LocalDate birthDate;
}
