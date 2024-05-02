package com.kuralesov .citizenservice.repository;

import com.kuralesov.citizenservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
