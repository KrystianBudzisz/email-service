package com.example.emailservice.service;

import com.example.emailservice.model.EmailDetails;

public interface EmailLIstenerService {



    void receiveMessage(EmailDetails emailDetails);
}
