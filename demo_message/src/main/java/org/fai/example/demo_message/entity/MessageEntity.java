package org.fai.example.demo_message.entity;

public class MessageEntity {
    private String message;

    public MessageEntity() {
    }

    public MessageEntity(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
