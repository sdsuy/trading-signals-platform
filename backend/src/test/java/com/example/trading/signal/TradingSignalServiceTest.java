package com.example.trading.signal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.trading.signal.model.SignalAction;
import com.example.trading.signal.repository.InMemoryTradingSignalRepository;
import com.example.trading.signal.service.TradingSignalService;

public class TradingSignalServiceTest {

    @Test
    void shouldCreateSignal(){
        var repository = new InMemoryTradingSignalRepository();
        var service = new TradingSignalService(repository);

        var signal = service.create("EURUSD", SignalAction.BUY, 1.1);

        assertNotNull(signal.getId());
        assertEquals("EURUSD", signal.getSymbol());
    }
}
