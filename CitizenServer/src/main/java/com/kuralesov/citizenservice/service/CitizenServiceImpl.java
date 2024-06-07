package com.kuralesov .citizenservice.service;

import com.kuralesov.citizenservice.client.CarClient;
import com.kuralesov.citizenservice.dto.CarDto;
import com.kuralesov.citizenservice.exception.CitizenNotFoundException;
import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("CitizenServiceImpl")
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    private final PassportService passport;
    private final CitizenRepository repository;
    private final CarClient carClient;
    private final KafkaTemplate template;
    public Citizen create(Citizen citizen){
        citizen.setPassport(passport.create());
        return repository.save(citizen);
    }

    @Override
    @Transactional
    public Citizen create(Citizen citizen, CarDto carDto) {
        citizen.setPassport(passport.create());
        Citizen savedCitizen = repository.save(citizen);
        carDto.setOwnerId(savedCitizen.getId());
        template.send("create_car", carDto);
        //carClient.create(carDto);
        return savedCitizen;
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
