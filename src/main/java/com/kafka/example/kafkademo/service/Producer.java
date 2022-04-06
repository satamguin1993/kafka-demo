package com.kafka.example.kafkademo.service;

import com.kafka.example.kafkademo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    public static final String topic = "myTopic1";

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    public void publishToTopic(String msg) {
        System.out.println("Publishing the message: " + msg);
        Employee emp = new Employee(1, msg, "satam");
        kafkaTemplate.send(topic, emp);
        System.out.println("Publishing done");
    }

}
