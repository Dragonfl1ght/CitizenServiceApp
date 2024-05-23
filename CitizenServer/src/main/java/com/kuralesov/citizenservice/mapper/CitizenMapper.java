package com.kuralesov .citizenservice.mapper;

import com.kuralesov.citizenservice.dto.CitizenEditRequest;
import com.kuralesov.citizenservice.dto.CitizenRequest;
import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.model.Car;
import com.kuralesov.citizenservice.model.Citizen;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitizenMapper {
    Citizen map(CitizenEditRequest citizenRequest);
   // @Mapping(target = "carList", source = "carList", qualifiedByName = "carListMap")
    CitizenResponse mapResponse(Citizen citizen);
    List<CitizenResponse> map(List<Citizen> citizenList);
    CitizenRequest map(Citizen citizen);
    Citizen map(CitizenRequest citizenRequest);
    @Named("carListMap")
    default List<CarResponse> carListMap(List<Car> carList){
        CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
        return INSTANCE.map(carList);
    }
}
