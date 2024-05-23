package com.kuralesov .citizenservice.controller;

import com.kuralesov.citizenservice.dto.CarDto;
import com.kuralesov.citizenservice.dto.CarEditRequest;
import com.kuralesov.citizenservice.mapper.CarMapper;
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
    public CarDto create(@RequestBody CarDto carDto) {
        return carMapper.map(service.create(carMapper.map(carDto)));
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CarDto getById(@PathVariable Long id) {
        return carMapper.map(service.getById(id));
    }

    @Override
    @GetMapping("/all")
    public List<CarDto> getAll() {return carMapper.map(service.getAll());}
    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete")
    public void deleteById(Long id) {
        service.deleteById(id);
    }

    @Override
    @PatchMapping("/{id}")
    public CarDto edit(@RequestBody CarEditRequest editRequest,@PathVariable Long id) {
        return  carMapper.map(service.edit(carMapper.map(editRequest), id));
    }

}
