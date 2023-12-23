package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CarEditRequest;
import com.kuralesov.citizenservice.mapper.CarMapper;
import com.kuralesov.citizenservice.model.Car;
import com.kuralesov.citizenservice.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarControllerImpl implements CarController{
    private CarService service;
    private CarMapper carMapper;
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Car create(@RequestBody Car car) {
        return service.create(car);
    }

    @Override
    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Override
    @GetMapping("/all")
    public List<Car> getAll() {
        return service.getAll();
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete")
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    @PatchMapping("/{id}")
    public Car edit(@RequestBody CarEditRequest editRequest,@PathVariable Long id) {
        return service.edit(carMapper.map(editRequest), id);
    }

}
