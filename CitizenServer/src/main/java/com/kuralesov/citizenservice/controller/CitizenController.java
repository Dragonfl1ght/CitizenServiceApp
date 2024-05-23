package com.kuralesov .citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CitizenController {
    CitizenResponse create(@RequestBody CitizenRequest citizenRequest);

    CitizenResponse getById(@PathVariable Long id);
    @GetMapping("/all")
    List<CitizenResponse> getAllCitizen();

    void deleteById(Long id);

    CitizenResponse update(Long id, CitizenRequest citizenRequest);

}