package com.example.exercise1garagecrud.car;

import com.example.exercise1garagecrud.car.car_service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @PostMapping("/cars/{id}")
    public Car createCar (@PathVariable Long id, @RequestBody Car car){
        return CarService.createCar(car);
    }

}
