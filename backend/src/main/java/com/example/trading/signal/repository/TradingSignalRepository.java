package com.example.trading.signal.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.trading.signal.model.TradingSignal;

public interface TradingSignalRepository {

    TradingSignal save(TradingSignal signal);

    List<TradingSignal> findAll();

    Optional<TradingSignal> findById(UUID id);

    void deleteById(UUID id);
}
