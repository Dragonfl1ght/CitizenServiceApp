package com.kuralesov.citizenservice.dto;

import com.kuralesov.citizenservice.model.Citizen;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePersonCarRequest {
    private CarDto carDto;
    private Citizen citizen;
}
