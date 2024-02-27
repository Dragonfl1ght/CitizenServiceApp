package com.kuralesov.citizenservice.mapper;

import com.kuralesov.citizenservice.dto.CitizenResponse;
import com.kuralesov.citizenservice.dto.HouseResponse;
import com.kuralesov.citizenservice.model.Citizen;
import com.kuralesov.citizenservice.model.House;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HouseMapper {
   // House map(CitizenEditRequest citizenRequest);
    @Mapping(target = "citizensResponses", source = "citizenList", qualifiedByName = "citizenListMap")
    HouseResponse map(House house);
    List<HouseResponse> map(List<House> housesList);
    @Named("citizenListMap")
     default List<CitizenResponse> citizenListMap(List<Citizen> citizenList){
        CitizenMapper INSTANCE = Mappers.getMapper(CitizenMapper.class);
        return INSTANCE.map(citizenList);
    }
}
