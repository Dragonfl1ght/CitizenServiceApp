package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.House;
import com.kuralesov.citizenservice.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class HouseServiceImpl implements HouseService{
    private HouseRepository repository;
    @Override
    public House create(House house) {
        return repository.save(house);
    }

    @Override
    public House getById(Long id) {
        return null;
    }

    @Override
    public List<House> getAllHouses() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public House edit(House house) {
        return null;
    }
}
