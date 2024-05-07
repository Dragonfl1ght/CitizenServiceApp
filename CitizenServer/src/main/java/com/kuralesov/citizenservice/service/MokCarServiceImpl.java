package com.kuralesov .citizenservice.service;

import com.kuralesov.citizenservice.dto.CarResponse;
import com.kuralesov.citizenservice.model.Car;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("Mok")
public class MokCarServiceImpl implements CarService{
    @Override
    public Car create(Car car) {
        throw new RuntimeException("create");
    }

    @Override
    public Car getById(Long id) {
        throw new RuntimeException("getById");
    }

    @Override
    public List<CarResponse> getAll() {
        throw new RuntimeException("getAll");
    }

    @Override
    public void deleteById(Long id) {
        throw new RuntimeException("deleteById");
    }

    @Override
    public Car edit(Car editRequest, Long id) {
        throw new RuntimeException("edit");
    }
}
