package org.fai.example.demo_message.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessagingService {
    @Value("${rabbitmq.routing_key}")
    private String routingKey;
    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;
    RabbitTemplate rabbitTemplate;
    @Autowired
    public MessagingService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, message);
    }
}
