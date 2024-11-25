import java.util.Map;

public record CambioMoneda(String result,
                           String documentation,
                           String terms_of_use,
                           double time_last_update_unix,
                           String time_last_update_utc,
                           double time_next_update_unix,
                           String time_next_update_utc,
                           String base_code,
                           Map<String, Double> conversion_rates) {
}

//java.lang.IllegalStateException: Expected BEGIN_ARRAY but was BEGIN_OBJECT
//ocurrió este error cuando "conversion_rates" era del tipo
//String, List, ArrayList, List<String> Arraylist<String>