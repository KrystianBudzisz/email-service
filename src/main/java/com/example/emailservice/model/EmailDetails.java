package com.example.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class EmailDetails {
    private String recipient;
    private String subject;
    private String body;

}
