package com.exchange;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String apiKey = "1b103669f548eaa8d482decb";
        ExchangeRateService exchangeRateService = new ExchangeRateService(apiKey);
        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateService);

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la moneda de origen (por ejemplo, USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        
        System.out.print("Ingrese la moneda de destino (por ejemplo, EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        
        System.out.print("Ingrese el monto a convertir: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = currencyConverter.convert(fromCurrency, toCurrency, amount);
            System.out.println(amount + " " + fromCurrency + " es equivalente a " + convertedAmount + " " + toCurrency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}