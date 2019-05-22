package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MessageProceeder {

    MessageService myMessageService1;
    MessageService myMessageService2;

    @Autowired
    public MessageProceeder(@Qualifier("email") MessageService myMessageService1,
                            @Qualifier("twitter")MessageService myMessageService2) {

        this.myMessageService1 = myMessageService1;
        this.myMessageService2 = myMessageService2;
    }

    public void processMessage(String message, String medium) {
        if (medium.contains("@") && medium.contains(".")) {
            myMessageService1.sendMessage(message, medium);
        } else {
            myMessageService2.sendMessage(message, medium);
        }
    }
}
