package com.example.trading.signal.controller.dto;

import com.example.trading.signal.model.SignalAction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CreateSignalRequest {

    @NotBlank
    public String symbol;

    @NotNull
    public SignalAction action;

    @Positive
    public double price;
}
