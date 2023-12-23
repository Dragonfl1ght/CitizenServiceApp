package com.kuralesov.citizenservice.service;

import com.kuralesov.citizenservice.model.Passport;
import com.kuralesov.citizenservice.repository.PassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class PassportServiceImpl implements PassportService{
   private final PassportRepository passportRepository;


    @Override
    public Passport create() {
        return passportRepository.save(Passport.builder().createDate(OffsetDateTime.now()).serialNumber(123L).build());
    }
}
