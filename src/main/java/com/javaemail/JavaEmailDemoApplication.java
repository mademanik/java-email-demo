package com.javaemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaEmailDemoApplication {

    @Autowired
    private EmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(JavaEmailDemoApplication.class, args);
    }

	@EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        senderService.sendEmail("manik.yasa@gmail.com",
                "This is subject demo", "This is body demo");
    }
}
