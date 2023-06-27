package com.example.exercise1garagecrud.car.car_service;

import com.example.exercise1garagecrud.car.Car;

import java.util.List;

public interface CarService {

    Car createCar (Car car);

    Car updateCar (Car car);
    void deleteCar (Long id);

    List<Car> getAllCars();
    Car getCar(Long id);
}
