package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.mapper.CitizenMapper;
import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CitizenServiceImpl")
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService{
    private final PassportService passport;
    private final CitizenRepository repository;
    private final CitizenMapper citizenMapper;
    public CitizenResponse create(Citizen citizen){
        citizen.setPassport(passport.create());
        return citizenMapper.map(repository.save(citizen));
    }

    @Override
    public CitizenResponse getById(Long id) {
        return citizenMapper.map(repository.findById(id).orElseThrow(() -> new RuntimeException("Citizen not found")));
    }

    @Override
    public List<CitizenResponse> getAllCitizen() {
        return citizenMapper.map(repository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public CitizenResponse update(Long id, Citizen citizen) {
        var oldCitizen = repository.findById(id).orElseThrow(() -> new RuntimeException("Citizen for update not found"));
        citizen.setId(oldCitizen.getId());
        return citizenMapper.map(repository.save(citizen));
    }

    @Override
    public CitizenResponse edit(Citizen map, Long id) {
        return null;
    }
}
