package com.example.emailservice.service.impl;

import lombok.AllArgsConstructor;
import com.example.emailservice.model.EmailDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.example.emailservice.service.EmailService;

@AllArgsConstructor
@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    private JavaMailSender mailSender;

    @Async
    public void sendEmail(EmailDetails emailDetails) {
        log.info("rozpoczynam wysyłkę");

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("olbrachjanek@gmail.com");
        message.setTo("krystianbudzisz1@gmail.com");
        message.setSubject("Currency Conversion Details");
        message.setText("From Currency: " + emailDetails.getFromCurrency() +
                "\nTo Currency: " + emailDetails.getToCurrency() +
                "\nExchange Rate: " + emailDetails.getExchangeRate() +
                "\nConverted Amount: " + emailDetails.getConvertedAmount());


        mailSender.send(message);
        log.info("wysyłka zakończona");
    }
}
