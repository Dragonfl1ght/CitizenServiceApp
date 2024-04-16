package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.client.CitizenClient;
import com.kuralesov.citizenservice.exception.CarNotFoundException;
import com.kuralesov.citizenservice.model.Car;
import com.kuralesov.citizenservice.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Profile("origin")
public class CarServiceImpl implements CarService{
   // private CitizenClient citizenClient;

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
    public Car edit(Car editRequest, Long id) {
        Car oldCar = repository.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        oldCar.setPrice(editRequest.getPrice());
        return repository.save(oldCar);
    }
}
