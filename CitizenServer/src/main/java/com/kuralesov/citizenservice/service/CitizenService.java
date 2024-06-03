package com.kuralesov .citizenservice.service;

import com.kuralesov.citizenservice.dto.CarDto;
import com.kuralesov.citizenservice.model.Citizen;

import java.util.List;

public interface CitizenService {
    Citizen create(Citizen citizen);


    Citizen create(Citizen citizen, CarDto carDto);

    Citizen getById(Long id);

    List<Citizen> getAllCitizen();

    void deleteById(Long id);

    Citizen update(Long id, Citizen citizen);

}
