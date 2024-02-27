package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.model.House;

import java.util.List;

public interface HouseService {
    House create(House house);
    House getById(Long id);
    List<House> getAllHouses();
    void deleteById(Long id);
    List<Citizen> getStreetResidents(String street);
    House addCitizen(Long citizenId, Long houseId);
}
