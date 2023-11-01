package com.kipper.emailservice.Infra.ses;


import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sesAwsConfig {
    @Bean
     public AmazonSimpleEmailService amazonSimpleEmailService(){
        return null;
    }
}
