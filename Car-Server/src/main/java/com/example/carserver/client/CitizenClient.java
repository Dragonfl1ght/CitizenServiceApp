package com.example.carserver.client;

import com.example.carserver.dto.CitizenRequest;
import com.example.carserver.dto.CitizenResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "citizen-client")
public interface CitizenClient {
    @PostMapping("/ciizen/create")
    public CitizenResponse create(@RequestBody CitizenRequest citizenRequest);
}
