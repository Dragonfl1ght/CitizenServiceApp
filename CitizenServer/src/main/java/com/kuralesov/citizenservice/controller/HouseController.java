package com.kuralesov .citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.dto.HouseResponse;
import com.kuralesov.citizenservice.model.House;

import java.util.List;

public interface HouseController {
    HouseResponse create(House house);
    HouseResponse getById(Long id);
    List<HouseResponse> getAllHouses();
    List<CitizenResponse> getStreetResidents(String street);
    void deleteById(Long id);
    HouseResponse addCitizen(Long citizenId, Long houseId);
}
