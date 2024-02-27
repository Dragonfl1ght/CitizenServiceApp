package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenEditRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.model.Citizen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CitizenController {
    CitizenResponse create(@RequestBody Citizen citizen);

    CitizenResponse getById(@PathVariable Long id);
    @GetMapping("/all")
    List<CitizenResponse> getAllCitizen();

    void deleteById(Long id);

    CitizenResponse update(Long id, Citizen citizen);
    CitizenResponse edit(CitizenEditRequest citizenEditRequest, Long id);
}