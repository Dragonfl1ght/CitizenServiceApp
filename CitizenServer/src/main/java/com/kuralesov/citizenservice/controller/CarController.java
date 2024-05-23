package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CarDto;
import com.kuralesov.citizenservice.dto.CarEditRequest;

import java.util.List;

public interface CarController {
    CarDto create(CarDto carRequest);
    CarDto getById(Long id);
    List<CarDto> getAll();
    void deleteById(Long id);
    CarDto edit(CarEditRequest editRequest, Long id);
}
