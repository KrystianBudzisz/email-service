package com.example.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class EmailDetails {
    private String email;
    private String toCurrency;
    private String fromCurrency;
    private String currencySymbol;
    private String exchangeRate;
    private String convertedAmount;
}
