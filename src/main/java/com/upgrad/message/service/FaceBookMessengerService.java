package com.upgrad.message.service;

import org.springframework.stereotype.Component;

@Component
public class FaceBookMessengerService implements MessageService {

    @Override
    public void send(String msg) {
        System.out.println("Messenger is sending message: "+ msg);
    }
}
