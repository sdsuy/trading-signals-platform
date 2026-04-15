package com.example.trading.signal.controller.dto;

import java.time.Instant;
import java.util.UUID;

import com.example.trading.signal.model.TradingSignal;

public class TradingSignalResponse {

    private UUID id;
    private String symbol;
    private String action;
    private double price;
    private Instant timestamp;

    public static TradingSignalResponse from(TradingSignal signal) {
        TradingSignalResponse r = new TradingSignalResponse();
        r.id = signal.getId();
        r.symbol = signal.getSymbol();
        r.action = signal.getAction().name();
        r.price = signal.getPrice();
        r.timestamp = signal.getTimestamp();
        return r;
    }

}
