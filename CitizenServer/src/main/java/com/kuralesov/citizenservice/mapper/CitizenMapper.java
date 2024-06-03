package com.kuralesov .citizenservice.mapper;

import com.kuralesov.citizenservice.dto.CitizenEditRequest;
import com.kuralesov.citizenservice.dto.CitizenRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.model.Citizen;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitizenMapper {
    Citizen map(CitizenEditRequest citizenRequest);
   // @Mapping(target = "carList", source = "carList", qualifiedByName = "carListMap")
    CitizenResponse mapResponse(Citizen citizen);
    List<CitizenResponse> map(List<Citizen> citizenList);
    CitizenRequest map(Citizen citizen);
    Citizen map(CitizenRequest citizenRequest);
}
