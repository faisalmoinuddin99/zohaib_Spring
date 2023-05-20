package com.zohaib.learnSpring.services;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Text Message:" + msg);
    }
}

