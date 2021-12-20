package com.reinfnt.springkafkatutorial.web;

import com.reinfnt.springkafkatutorial.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    private KafkaProducerService kafkaProducerService;

    public KafkaProducerController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/sendMessage")
    public void sendMessage(String message) {
        this.kafkaProducerService.sendMessage(message);
    }
}
