package com.example.trading.signal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trading.signal.model.TradingSignalEntity;

public interface JpaTradingSignalRepository extends JpaRepository<TradingSignalEntity, UUID> {
}
