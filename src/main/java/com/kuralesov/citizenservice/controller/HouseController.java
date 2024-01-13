package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.model.House;

import java.util.List;

public interface HouseController {
    House create(House house);
    House getById(Long id);
    List<House> getAllHouses();
    void deleteById(Long id);
    House edit(House house);
}
