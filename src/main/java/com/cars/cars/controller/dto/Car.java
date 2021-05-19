package com.cars.cars.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Car {
    @Id
    private String modelo;
    private String marca;
    private String color;
}
