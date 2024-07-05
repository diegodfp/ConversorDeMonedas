package com.exchange;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class ExchangeRateService {
    private final String apiKey;
    private final HttpClient httpClient;

    public ExchangeRateService(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
    }

    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        String endpoint = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", apiKey, fromCurrency);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonResponse = new JSONObject(response.body());
        return jsonResponse.getJSONObject("conversion_rates").getDouble(toCurrency);
    }
}
