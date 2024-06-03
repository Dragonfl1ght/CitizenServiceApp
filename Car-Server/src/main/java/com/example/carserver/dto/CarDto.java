package com.example.carserver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    private Long id;
    private String model;
    private Integer price;
    private Long ownerId;
}
