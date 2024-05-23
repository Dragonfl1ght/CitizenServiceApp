package com.kuralesov .citizenservice.service;

import com.kuralesov.citizenservice.client.CarClient;
import com.kuralesov.citizenservice.exception.CitizenNotFoundException;
import com.kuralesov.citizenservice.mapper.CitizenMapper;
import com.kuralesov.citizenservice.model.Car;
import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CitizenServiceImpl")
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    private final PassportService passport;
    private final CitizenRepository repository;
    private final CitizenMapper citizenMapper;
    private final CarClient carClient;
    public Citizen create(Citizen citizen){
        citizen.setPassport(passport.create());
        return repository.save(citizen);
    }

    @Override
    public Citizen create(Citizen citizen, Car car) {
        citizen.setPassport(passport.create());
        car.setOwner(citizen);
        citizen.getCarList().add(carClient.create(car));
        return repository.save(citizen);
    }

    @Override
    public Citizen getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new CitizenNotFoundException(id));
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Citizen update(Long id, Citizen citizen) {
        var oldCitizen = repository.findById(id).orElseThrow(() -> new RuntimeException("Citizen for update not found"));
        citizen.setId(oldCitizen.getId());
        return repository.save(citizen);
    }

}
