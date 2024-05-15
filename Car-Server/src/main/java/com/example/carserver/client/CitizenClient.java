package com.example.carserver.client;

import com.example.carserver.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "citizen-client")
public interface CitizenClient {
    @PostMapping("/ciizen/create")
    public Citizen create(@RequestBody Citizen citizen);
}
