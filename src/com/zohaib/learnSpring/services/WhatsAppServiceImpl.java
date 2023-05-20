package com.zohaib.learnSpring.services;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp Message:" + msg);
    }
}
