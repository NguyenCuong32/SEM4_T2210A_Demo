package org.fai.example.demo_message.controller;

import org.fai.example.demo_message.entity.MessageEntity;
import org.fai.example.demo_message.services.MessagingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private MessagingService messagingService;
    public MessageController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }
    @PostMapping("/message")
    public void setMessagingService(@RequestBody MessageEntity message ) {
        this.messagingService.sendMessage(message.getMessage());
    }
}
