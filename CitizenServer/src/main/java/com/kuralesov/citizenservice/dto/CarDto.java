package com.kuralesov.citizenservice.dto;

import com.kuralesov.citizenservice.model.Citizen;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarDto {
    private Long id;
    private String model;
    private Integer price;
    private Citizen owner;
}
