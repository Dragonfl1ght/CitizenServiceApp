package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CarEditRequest;
import com.kuralesov.citizenservice.model.Car;

import java.util.List;

public interface CarController {
    Car create(Car car);
    Car getById(Long id);
    List<Car> getAll();
    void deleteById(Long id);
    Car edit(CarEditRequest editRequest, Long id);
}
