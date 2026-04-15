package com.example.trading.signal.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.trading.signal.model.TradingSignal;

@Repository
public class InMemoryTradingSignalRepository implements TradingSignalRepository {

    private final Map<UUID, TradingSignal> storage = new HashMap<>();

    @Override
    public TradingSignal save(TradingSignal signal) {
        storage.put(signal.getId(), signal);
        return signal;
    }

    @Override
    public List<TradingSignal> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public Optional<TradingSignal> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public void deleteById(UUID id) {
        storage.remove(id);
    }
}
