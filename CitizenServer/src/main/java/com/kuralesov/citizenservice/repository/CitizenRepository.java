package com.kuralesov .citizenservice.repository;

import com.kuralesov.citizenservice.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Long> {
}
