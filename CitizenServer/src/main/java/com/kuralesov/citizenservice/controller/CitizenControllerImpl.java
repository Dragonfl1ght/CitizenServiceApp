package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenEditRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.dto.CreatePersonCarRequest;
import com.kuralesov.citizenservice.mapper.CitizenMapper;
import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenControllerImpl implements com.kuralesov.citizenservice.controller.CitizenController {
    private final CitizenService service;
    private final CitizenMapper citizenMapper;
    @Autowired
    public CitizenControllerImpl(@Qualifier("CitizenServiceImpl") CitizenService service, CitizenMapper citizenMapper) {
        this.service = service;
        this.citizenMapper = citizenMapper;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CitizenResponse create(@RequestBody Citizen citizen){
        return  service.create(citizen);
    }

    @PostMapping("/create-with-car")
    @ResponseStatus(HttpStatus.CREATED)
    public CitizenResponse create(@RequestBody CreatePersonCarRequest request){
        return  service.create(request.getCitizen(), request.getCar());
    }
    @Override
    @GetMapping("/{id}")
    public CitizenResponse getById(@PathVariable Long id) {
        return citizenMapper.map(service.getById(id));
    }

    @Override

    public List<CitizenResponse> getAllCitizen() {
        return service.getAllCitizen();
    }
    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @Override
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CitizenResponse update(@PathVariable Long id, @RequestBody Citizen citizen) {
        return service.update(id, citizen);
    }

    @Override
    public CitizenResponse edit(CitizenEditRequest citizenEditRequest, Long id) {
        return service.edit(citizenMapper.map(citizenEditRequest), id);
    }
}
