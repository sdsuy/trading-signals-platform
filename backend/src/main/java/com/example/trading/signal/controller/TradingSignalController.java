package com.example.trading.signal.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trading.signal.model.SignalAction;
import com.example.trading.signal.model.TradingSignal;
import com.example.trading.signal.service.TradingSignalService;

@RestController
@RequestMapping("/signals")
public class TradingSignalController {

    private final TradingSignalService service;

    public TradingSignalController(TradingSignalService service) {
        this.service = service;
    }

    @PostMapping
    public TradingSignal create(@RequestBody CreateSignalRequest request) {
        return service.create(request.symbol, request.action, request.price);
    }

    @GetMapping
    public List<TradingSignal> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TradingSignal getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }

    static class CreateSignalRequest {
        public String symbol;
        public SignalAction action;
        public double price;
    }
}
