package com.upgrad;

import com.upgrad.message.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.upgrad");
        MessageController messageController = (MessageController) context.getBean("messageController");


        messageController.sendMessage("Spring is ready (now) to send messages");
    }
}
