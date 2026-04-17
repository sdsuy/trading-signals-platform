package com.example.trading.signal.mapper;

import com.example.trading.signal.model.TradingSignal;
import com.example.trading.signal.model.TradingSignalEntity;

public class TradingSignalMapper {

    public static TradingSignalEntity toEntity(TradingSignal model) {
        TradingSignalEntity e = new TradingSignalEntity();
        e.setId(model.getId());
        e.setSymbol(model.getSymbol());
        e.setAction(model.getAction());
        e.setPrice(model.getPrice());
        e.setTimestamp(model.getTimestamp());
        return e;
    }

    public static TradingSignal toModel(TradingSignalEntity e) {
        return new TradingSignal(
            e.getId(),
            e.getSymbol(),
            e.getAction(),
            e.getPrice(),
            e.getTimestamp()
        );
    }
}
