package com.example.exercise1garagecrud.car.car_service;

import com.example.exercise1garagecrud.car.Car;
import com.example.exercise1garagecrud.car.Carsrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceimpl implements CarService {

    private final Carsrepository carsrepository;

    public CarServiceimpl(Carsrepository carsrepository) {
        this.carsrepository = carsrepository;
    }

    @Override
    public Car createCar(Car car) {
        return Carsrepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
    return Carsrepository.save(car);
    }

    @Override
    public void deleteCar(Long id) {
        return Carsrepository.deleteById(id);

    }

    @Override
    public List<Car> getAllCars() {
        return Carsrepository.findAll();
    }

    @Override
    public Car getCar(Long id) {
        return Carsrepository.findById(id).orElseThrow();
    }
}
