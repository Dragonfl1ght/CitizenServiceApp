package com.example.carserver.controller;

import com.example.carserver.model.Car;

import java.util.List;

public interface CarController  {
    Car create(Car car);
    Car getById(Long id);
    List<Object> getAll();
    void deleteById(Long id);
    Car edit(Object editRequest, Long id);
}
