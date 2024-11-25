import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CalculaCambio {

    public double calcularCambio(double cantidadOrigen, String monedaDestino, CambioMoneda cambioMoneda) {
        // Verificamos si la moneda de destino existe en "conversion_rates"
        if (!cambioMoneda.conversion_rates().containsKey(monedaDestino)) {
            throw new IllegalArgumentException("Moneda destino no encontrada: " + monedaDestino);
        }

        // Obtenemos la tasa de cambio y realizamos el cálculo
        double tasaCambio = cambioMoneda.conversion_rates().get(monedaDestino);
        return cantidadOrigen * tasaCambio;
    }
}
