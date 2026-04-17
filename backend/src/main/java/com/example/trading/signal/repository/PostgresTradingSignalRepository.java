package com.example.trading.signal.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.trading.signal.mapper.TradingSignalMapper;
import com.example.trading.signal.model.TradingSignal;

@Repository
@Primary
public class PostgresTradingSignalRepository implements TradingSignalRepository {

    private final JpaTradingSignalRepository jpaRepository;

    public PostgresTradingSignalRepository(JpaTradingSignalRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public TradingSignal save(TradingSignal signal) {
        var entity = TradingSignalMapper.toEntity(signal);
        return TradingSignalMapper.toModel(jpaRepository.save(entity));
    }

    @Override
    public List<TradingSignal> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(TradingSignalMapper::toModel)
                .toList();
    }

    @Override
    public Optional<TradingSignal> findById(UUID id) {
        return jpaRepository.findById(id)
                .map(TradingSignalMapper::toModel);
    }

    @Override
    public void deleteById(UUID id) {
        jpaRepository.deleteById(id);
    }

}
