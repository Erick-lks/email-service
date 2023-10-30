package com.kipper.emailservice.Adpaters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);

}
