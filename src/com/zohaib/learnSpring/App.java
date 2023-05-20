package com.zohaib.learnSpring;

import com.zohaib.learnSpring.services.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // This class needs the TextMessageService Object to send message

        // It depends on TextMessageService Object

        // Who will provide this ?
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.zohaib.learnSpring");
        MessageService messageService = (MessageService) applicationContext.getBean("messageServiceImpl");
        messageService.sendMessage("Hello Zohaib!");

    }
}
