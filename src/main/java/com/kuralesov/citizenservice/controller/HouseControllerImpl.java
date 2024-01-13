package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.model.House;
import com.kuralesov.citizenservice.service.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/house")
@AllArgsConstructor
public class HouseControllerImpl implements HouseController{
    private HouseService service;
    @Override
    @PostMapping("/create")
    public House create(@RequestBody House house) {
        return service.create(house);
    }

    @Override
    public House getById(Long id) {
        return null;
    }

    @Override
    @GetMapping("/all")
    public List<House> getAllHouses() {
        return service.getAllHouses();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public House edit(House house) {
        return null;
    }
}
