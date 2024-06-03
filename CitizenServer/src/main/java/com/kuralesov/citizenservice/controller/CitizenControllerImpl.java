package com.kuralesov.citizenservice.controller;

import com.kuralesov.citizenservice.dto.CitizenRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.dto.CreatePersonCarRequest;
import com.kuralesov.citizenservice.mapper.CitizenMapper;
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
    public CitizenResponse create(@RequestBody CitizenRequest citizenRequest){
        return citizenMapper.mapResponse(service.create(citizenMapper.map(citizenRequest)));
    }

    @PostMapping("/create-with-car")
    @ResponseStatus(HttpStatus.CREATED)
    public CitizenResponse create(@RequestBody CreatePersonCarRequest request){
        return citizenMapper.mapResponse(service.create(request.getCitizen(), request.getCarDto()));
    }
    @Override
    @GetMapping("/{id}")
    public CitizenResponse getById(@PathVariable Long id) {
        return citizenMapper.mapResponse(service.getById(id));
    }

    @Override
    public List<CitizenResponse> getAllCitizen() {
        return citizenMapper.map(service.getAllCitizen());
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
    public CitizenResponse update(@PathVariable Long id, @RequestBody CitizenRequest citizenRequest) {
        return citizenMapper.mapResponse(service.update(id, citizenMapper.map(citizenRequest)));
    }
}
