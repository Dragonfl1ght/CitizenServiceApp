package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.House;

import java.util.List;

public interface HouseService {
    House create(House house);
    House getById(Long id);
    List<House> getAllHouses();
    void deleteById(Long id);
    House edit(House house);
}
