package com.kuralesov.citizenservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HouseResponse {
    private List<CitizenResponse> citizensResponses;
    private Long id;
    private String street;
    private Long houseNumber;
}
