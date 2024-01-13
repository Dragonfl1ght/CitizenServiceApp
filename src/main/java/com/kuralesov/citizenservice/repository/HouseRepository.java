package com.kuralesov.citizenservice.repository;

import com.kuralesov.citizenservice.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
