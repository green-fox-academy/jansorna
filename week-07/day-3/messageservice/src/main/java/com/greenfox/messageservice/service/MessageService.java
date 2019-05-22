package com.greenfox.messageservice.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageService {
    void sendMessage(String message, String medium);
}
