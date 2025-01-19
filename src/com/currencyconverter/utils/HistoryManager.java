package com.currencyconverter.utils;

import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;

public class HistoryManager {
    public static void saveConversion(String baseCurrency, String targetCurrency, double amount, double result) {
        // Crear un objeto JsonObject para almacenar la conversión
        JsonObject conversion = new JsonObject();
        conversion.addProperty("baseCurrency", baseCurrency);
        conversion.addProperty("targetCurrency", targetCurrency);
        conversion.addProperty("amount", amount);
        conversion.addProperty("result", result);

        // Guardar el objeto JSON en un archivo
        try (FileWriter file = new FileWriter("conversion_history.json", true)) {
            file.write(conversion.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving conversion.");
            e.printStackTrace();
        }
    }
}
