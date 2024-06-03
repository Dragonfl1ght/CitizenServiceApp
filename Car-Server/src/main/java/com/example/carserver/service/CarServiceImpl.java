package com.example.carserver.service;


import com.example.carserver.dto.CarEditRequest;
import com.example.carserver.exceptions.CarNotFoundException;
import com.example.carserver.model.Car;
import com.example.carserver.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
//@Profile("origin")
public class CarServiceImpl implements CarService {

    private CarRepository repository;
    @Override
    public Car create(Car car) {
        return repository.save(car);
    }

    @Override
    public Car getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CarNotFoundException(id));
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Car edit(CarEditRequest carEditRequest, Long id) {
        Car oldCar = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        oldCar.setPrice(carEditRequest.getPrice());
        return repository.save(oldCar);
    }
}
