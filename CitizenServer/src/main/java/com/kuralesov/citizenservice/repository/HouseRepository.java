package com.kuralesov .citizenservice.repository;

import com.kuralesov.citizenservice.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HouseRepository extends JpaRepository<House, Long> {
    //@Query(nativeQuery = true, value = "ALTER TABLE ")
    //House getHousesBy();
    @Query("SELECT h FROM House h WHERE UPPER(h.street) = UPPER(:street)")
    List<House> findResidentsByStreet(@Param("street") String street);
}

