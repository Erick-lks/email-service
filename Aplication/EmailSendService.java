package com.kipper.emailservice.Aplication;

import com.kipper.emailservice.Adpaters.EmailSenderGateway;
import com.kipper.emailservice.core.EmailSendUsercase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSendService implements EmailSendUsercase {

  private EmailSenderGateway   emailSenderGateway;

    @Autowired
    public EmailSendService(EmailSenderGateway emailgateway){
        this.emailSenderGateway = emailgateway;
    }
  @Override
  public void sendmail(String to, String subject, String body) {
      this.emailSenderGateway.sendEmail(to,subject,body);

  }
}
