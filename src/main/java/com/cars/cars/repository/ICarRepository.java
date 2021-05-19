package com.cars.cars.repository;

import com.cars.cars.controller.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarRepository extends JpaRepository<Car,String> {
}
