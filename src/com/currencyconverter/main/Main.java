package com.currencyconverter.main;

import com.currencyconverter.api.CurrencyConverterAPI;
import com.currencyconverter.utils.HistoryManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uso de try-with-resources para asegurar que el Scanner se cierre automáticamente
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Welcome to the Currency Converter!");

            System.out.print("Enter base currency (e.g., USD): ");
            String baseCurrency = scanner.nextLine();

            System.out.print("Enter target currency (e.g., EUR): ");
            String targetCurrency = scanner.nextLine();

            System.out.print("Enter amount to convert: ");
            double amount = scanner.nextDouble();

            CurrencyConverterAPI converter = new CurrencyConverterAPI();
            double result = converter.convertCurrency(baseCurrency, targetCurrency, amount);

            System.out.println("Converted amount: " + result);

            HistoryManager.saveConversion(baseCurrency, targetCurrency, amount, result);
            System.out.println("Conversion saved to history.");
        }
    }
}
