package com.exchange;

import java.io.IOException;

public class CurrencyConverter {
private final ExchangeRateService exchangeRateService;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws IOException, InterruptedException {
        double rate = exchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
