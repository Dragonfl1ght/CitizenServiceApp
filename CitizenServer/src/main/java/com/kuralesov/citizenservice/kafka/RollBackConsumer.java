package com.kuralesov.citizenservice.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuralesov.citizenservice.service.CitizenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class RollBackConsumer {
    private final CitizenService service;
    @KafkaListener(topics = "rollback_event", groupId = "rollback_consumer")
    public void listen(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Long id = objectMapper.readValue(message, Long.class);
        service.deleteById(id);
        log.info("Request for delete citizen by id = " + id);
    }
}
