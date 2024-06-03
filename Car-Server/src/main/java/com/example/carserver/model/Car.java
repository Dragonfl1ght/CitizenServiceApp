package com.example.carserver.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //todo сделать последовательность в базе данных
    private Long id;
    private String model;
    private Long manufactureYear;
    private Long price;
    @Column(name = "owner_id")
    private Long ownerId;
    @Transient
    private Long insuranceAmount;

}
