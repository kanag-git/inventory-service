package com.yango.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageConsumer {

    @KafkaListener(
            topics = "test-topic",
            groupId = "my-group"
    )
    public void listen(String message) {

        System.out.println("Thread " + Thread.currentThread()
                                             .getName() + " received: " + message);

    }
}