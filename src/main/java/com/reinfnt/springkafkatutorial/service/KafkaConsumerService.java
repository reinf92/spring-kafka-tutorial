package com.reinfnt.springkafkatutorial.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "reinfnt", groupId = "reinfnt")
    public void consume(String message) throws IOException {
        System.out.println("receive message : " + message);
    }
}
