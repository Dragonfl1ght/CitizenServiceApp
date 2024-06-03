package com.kuralesov.citizenservice.client;

import com.kuralesov.citizenservice.dto.CarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "car-server")
public interface CarClient {

    @PostMapping("/car/create")
    public CarDto create(@RequestBody CarDto carDto);
}
