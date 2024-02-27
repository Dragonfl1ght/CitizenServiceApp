package com.kuralesov.citizenservice.repository;

import com.kuralesov.citizenservice.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
