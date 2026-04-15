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

    public TradingSignalResponse() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

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
