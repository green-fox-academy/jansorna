package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("email")
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String emailAdress) {
        System.out.println("Email Sent to " + emailAdress + " with Message =  " + message);
    }
}
