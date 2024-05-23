package com.example.carserver.controller;


import com.example.carserver.dto.CarDto;
import com.example.carserver.dto.CarEditRequest;

import java.util.List;

public interface CarController {
    CarDto create(CarDto carDto);
    CarDto getById(Long id);
    List<CarDto> getAll();
    void deleteById(Long id);
    CarDto edit(CarEditRequest carEditRequest, Long id);
}
