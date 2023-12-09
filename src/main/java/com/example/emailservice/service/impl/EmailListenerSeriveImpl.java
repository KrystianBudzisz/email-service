package com.example.emailservice.service.impl;

import com.example.emailservice.service.EmailLIstenerService;
import com.example.emailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import com.example.emailservice.model.EmailDetails;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailListenerSeriveImpl implements EmailLIstenerService {

    private final EmailService emailService;

    @RabbitListener(queues = "${rabbit.mailQueueName}")
    public void receiveMessage(EmailDetails emailDetails) {
        emailService.sendEmail(emailDetails);
    }


}
