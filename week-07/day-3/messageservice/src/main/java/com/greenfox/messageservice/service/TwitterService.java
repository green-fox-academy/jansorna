package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("twitter")
public class TwitterService implements MessageService {

    @Override
    public void sendMessage(String message, String twitterProfile) {
        System.out.println("Tweet published at " + twitterProfile + " with Message =  " + message);
    }
}
