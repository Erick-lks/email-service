package com.kipper.emailservice.Controllers;


import com.kipper.emailservice.Aplication.EmailSendService;
import com.kipper.emailservice.core.EmailRequest;
import com.kipper.emailservice.core.Exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")

public class EmailSenderController {

    private final EmailSendService emailSendService;


    @Autowired
    public EmailSenderController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @PostMapping()
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        try {
            this.emailSendService.sendmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("Email send sucessfully");
        } catch (EmailServiceException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");


        }
    }
}
