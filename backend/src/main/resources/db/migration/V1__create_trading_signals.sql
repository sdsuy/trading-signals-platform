CREATE TABLE trading_signals (
    id UUID PRIMARY KEY,
    symbol VARCHAR(20) NOT NULL,
    action VARCHAR(10) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    timestamp TIMESTAMP NOT NULL
);