package com.currencyconverter.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverterAPI {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double convertCurrency(String baseCurrency, String targetCurrency, double amount) {
        try {
            // Usar URI en lugar de URL directamente
            URI uri = new URI(API_URL + baseCurrency);
            URL url = uri.toURL();  // Convertir URI a URL

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(url.openStream());
            String response = scanner.useDelimiter("\\Z").next();
            scanner.close();

            // Usar Gson JsonObject para analizar la respuesta
            JsonObject jsonObject = JsonParser.parseString(response).getAsJsonObject();
            double rate = jsonObject.getAsJsonObject("rates").get(targetCurrency).getAsDouble();

            return amount * rate;
        } catch (Exception e) {
            System.out.println("Error fetching conversion rate.");
            e.printStackTrace();
            return 0;
        }
    }
}
