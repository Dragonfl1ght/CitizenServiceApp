package com.example.carserver.service;

import com.example.carserver.model.Car;

import java.util.List;

public interface CarService {
    Car create(Car car);
    Car getById(Long id);
    List<Car> getAll();
    void deleteById(Long id);
    Car edit(Car editRequest, Long id);
}
