package com.example.trading.signal.controller.dto;

import com.example.trading.signal.model.SignalAction;

public class CreateSignalRequest {
    public String symbol;
    public SignalAction action;
    public double price;
}
