package com.example.carserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    //todo сделать последовательность в базе данных
    private Long id;
    private String model;
    private Long manufactureYear;
    private Long price;
    @Transient
    private Long insuranceAmount;

}
