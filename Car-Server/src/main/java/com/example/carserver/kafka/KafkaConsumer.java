package com.example.carserver.kafka;

import com.example.carserver.dto.CarDto;
import com.example.carserver.mapper.CarMapper;
import com.example.carserver.service.PersonDistributedTransactionalService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor

public class KafkaConsumer {
    private final PersonDistributedTransactionalService service;
    private final CarMapper mapper;
    @KafkaListener(topics = "create_car", groupId = "my_consumer")
    public void listen(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        CarDto carDto = objectMapper.readValue(message, CarDto.class);
        service.carCreateOrRollback(mapper.map(carDto));
    }
}
