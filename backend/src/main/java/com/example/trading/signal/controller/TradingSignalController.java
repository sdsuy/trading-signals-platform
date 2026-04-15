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

import com.example.trading.signal.controller.dto.CreateSignalRequest;
import com.example.trading.signal.controller.dto.TradingSignalResponse;
import com.example.trading.signal.model.TradingSignal;
import com.example.trading.signal.service.TradingSignalService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/signals")
public class TradingSignalController {

    private final TradingSignalService service;

    public TradingSignalController(TradingSignalService service) {
        this.service = service;
    }

    @PostMapping
    public TradingSignalResponse create(@Valid @RequestBody CreateSignalRequest request) {
        TradingSignal signal = service.create(
                request.symbol,
                request.action,
                request.price
        );
        return TradingSignalResponse.from(signal);
    }

    @GetMapping
    public List<TradingSignalResponse> getAll() {
        return service.getAll()
                .stream()
                .map(TradingSignalResponse::from)
                .toList();
    }

    @GetMapping("/{id}")
    public TradingSignalResponse getById(@PathVariable UUID id) {
        return TradingSignalResponse.from(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}
