package com.example.week4day3;

public class MessageEvent {
    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public MessageEvent(String message) {
        Message = message;
    }
}
