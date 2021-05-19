package com.cars.cars.rest;

import com.cars.cars.controller.dto.Car;
import com.cars.cars.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class RestCarController {

    @Autowired
    ICarRepository iCarRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Car>> obtenerClientes(){
        return new ResponseEntity<>(iCarRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public Car insertCar(@RequestBody Car car){
        iCarRepository.save(car);
        return car;
    }

}
