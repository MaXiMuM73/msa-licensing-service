package com.max.licensingservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/produceMessage")
    public void produceMessage(String message) {
        kafkaTemplate.send("topic-test", message);
        log.info("Сообщение отправлено: {}", message);
    }
}
