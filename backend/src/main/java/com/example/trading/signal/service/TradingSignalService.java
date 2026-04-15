package com.example.trading.signal.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.trading.signal.exception.ResourceNotFoundException;
import com.example.trading.signal.model.SignalAction;
import com.example.trading.signal.model.TradingSignal;
import com.example.trading.signal.repository.TradingSignalRepository;

@Service
public class TradingSignalService {

    private final TradingSignalRepository repository;

    public TradingSignalService(TradingSignalRepository repository) {
        this.repository = repository;
    }

    public TradingSignal create(String symbol, SignalAction action, double price) {
        TradingSignal signal = TradingSignal.create(symbol, action, price);
        return repository.save(signal);
    }

    public List<TradingSignal> getAll() {
        return repository.findAll();
    }

    public TradingSignal getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Signal not found: " + id));
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
