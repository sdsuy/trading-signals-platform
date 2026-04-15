package com.example.trading.signal.model;

import java.time.Instant;
import java.util.UUID;

public class TradingSignal {

    private UUID id;
    private String symbol;
    private SignalAction action;
    private double price;
    private Instant timestamp;

    public TradingSignal() {
    }

    public TradingSignal(UUID id, String symbol, SignalAction action, double price, Instant timestamp) {
        this.id = id;
        this.symbol = symbol;
        this.action = action;
        this.price = price;
        this.timestamp = timestamp;
    }

    public static TradingSignal create(String symbol, SignalAction action, double price) {
        return new TradingSignal(UUID.randomUUID(), symbol, action, price, Instant.now());
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

    public SignalAction getAction() {
        return action;
    }

    public void setAction(SignalAction action) {
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

}
