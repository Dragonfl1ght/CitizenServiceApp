package com.kuralesov .citizenservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarResponse {
    private Long id;
    private String model;
    private Integer price;
}
