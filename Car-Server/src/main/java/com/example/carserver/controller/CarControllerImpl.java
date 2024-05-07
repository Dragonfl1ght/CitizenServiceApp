package com.example.carserver.controller;

import com.example.carserver.model.Car;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarControllerImpl implements CarController{
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public Car create(@RequestBody Car car) {
        System.out.println("create car");
    return null;
    }

    @Override
    @GetMapping("/{id}")
    public Car getById(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/all")
    public List<Object> getAll() {return null;}
    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete")
    public void deleteById(Long id) {
        System.out.println("Hello World");
    }

    @Override
    @PatchMapping("/{id}")
    public Car edit(@RequestBody Object Object,@PathVariable Long id) {
        return null;
    }
}
