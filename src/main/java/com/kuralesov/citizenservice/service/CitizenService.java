package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.model.Citizen;

import java.util.List;

public interface CitizenService {
    CitizenResponse create(Citizen citizen);
    Citizen getById(Long id);

    List<CitizenResponse> getAllCitizen();

    void deleteById(Long id);

    CitizenResponse update(Long id, Citizen citizen);

    CitizenResponse edit(Citizen map, Long id);
}
