package com.kuralesov .citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.dto.HouseResponse;
import com.kuralesov.citizenservice.mapper.CitizenMapper;
import com.kuralesov.citizenservice.mapper.HouseMapper;
import com.kuralesov.citizenservice.model.House;
import com.kuralesov.citizenservice.service.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/house")
@AllArgsConstructor
public class HouseControllerImpl implements HouseController {
    private HouseService service;
    private HouseMapper mapper;
    private CitizenMapper citizenMapper;

    @Override
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public HouseResponse create(@RequestBody House house) {
        return mapper.map(service.create(house));
    }

    @Override
    @GetMapping("/{id}")
    public HouseResponse getById(@PathVariable Long id) {
        return mapper.map(service.getById(id));
    }

    @Override
    @GetMapping("/all")
    public List<HouseResponse> getAllHouses() {
        return mapper.map(service.getAllHouses());
    }

    @Override
    @GetMapping("/residents/{street}")
    public List<CitizenResponse> getStreetResidents(@PathVariable String street) {
        return citizenMapper.map(service.getStreetResidents(street));
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Override
    @PatchMapping("/add/citizen")
    public HouseResponse addCitizen(@RequestParam(name = "citizenId") Long citizenId, @RequestParam(name = "houseId") Long houseId) {
        return mapper.map(service.addCitizen(citizenId, houseId));
    }
}
