package com.kafka.example.kafkademo.service;

import com.kafka.example.kafkademo.pojo.Employee;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "myTopic1", groupId = "myGroup")
    public void consumeFromTopic(Employee employee) {
        System.out.println("Consumed msg : " + employee.toString());
    }

}
