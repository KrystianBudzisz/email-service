package com.example.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class EmailDetails {
    private String recipient;
    private String subject;
    private String body;

}
