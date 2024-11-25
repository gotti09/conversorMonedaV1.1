import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConsultaCambioMoneda {

    public CambioMoneda consultarCambioMonedas(String simboloMonedaOrigen) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8dbad3ec265718dde2e6c4a1/latest/"+simboloMonedaOrigen);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Parseamos la respuesta JSON
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            // Extraemos campos principales
            String result = json.get("result").getAsString();
            String documentation = json.get("documentation").getAsString();
            String termsOfUse = json.get("terms_of_use").getAsString();
            double timeLastUpdateUnix = json.get("time_last_update_unix").getAsDouble();
            String timeLastUpdateUtc = json.get("time_last_update_utc").getAsString();
            double timeNextUpdateUnix = json.get("time_next_update_unix").getAsDouble();
            String timeNextUpdateUtc = json.get("time_next_update_utc").getAsString();
            String baseCode = json.get("base_code").getAsString();

            // Extraemos las tasas de cambio
            JsonObject conversionRatesJson = json.getAsJsonObject("conversion_rates");
            Map<String, Double> conversionRates = new HashMap<>();
            for (String key : conversionRatesJson.keySet()) {
                conversionRates.put(key, conversionRatesJson.get(key).getAsDouble());
            }

            // Construimos el objeto CambioMoneda
            return new CambioMoneda(
                    result,
                    documentation,
                    termsOfUse,
                    timeLastUpdateUnix,
                    timeLastUpdateUtc,
                    timeNextUpdateUnix,
                    timeNextUpdateUtc,
                    baseCode,
                    conversionRates
            );
        } catch (Exception e) {
            throw new RuntimeException("Error al consultar la API", e);
        }
    }
}
