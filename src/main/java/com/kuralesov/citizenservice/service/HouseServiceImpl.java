package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.model.House;
import com.kuralesov.citizenservice.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class HouseServiceImpl implements HouseService{
    private HouseRepository repository;
    private CitizenService citizenService;
    @Override
    public House create(House house) {
        return repository.save(house);
    }

    @Override
    public House getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<House> getAllHouses() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Citizen> getStreetResidents(String street) {
        return repository.findResidentsByStreet(street).stream()
                .flatMap(house -> house.getCitizenList().stream())
                .toList();
    }

    @Override
    public House addCitizen(Long citizenId, Long houseId) {
        House house = repository.findById(houseId).orElseThrow();
        house.getCitizenList().add(citizenService.getById(citizenId));
        Citizen citizen = citizenService.getById(citizenId);
        citizen.getHouseList().add(repository.findById(houseId).orElseThrow());
        citizenService.create(citizen);
        return repository.save(house);
    }
}
