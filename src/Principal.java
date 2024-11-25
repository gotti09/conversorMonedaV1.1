import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double cantidadOrigen;
        double cantidadResultante;
        String monedaOrigen="";
        String monedaDestino="";
        String menu = """
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Salir
                """;
        ConsultaCambioMoneda consultaCambios = new ConsultaCambioMoneda();
        CalculaCambio cambioResultante = new CalculaCambio();


        while (opcion != 7) {
            System.out.println("**********************************************");
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println(menu);
            System.out.println("Elija una opción válida");
            System.out.println("**********************************************");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: //Dolar =>> Peso argentino
                    try {
                        monedaOrigen = "USD";
                        monedaDestino = "ARS";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 2: //Peso argentino =>> Dolar
                    try {
                        monedaOrigen = "ARS";
                        monedaDestino = "USD";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 3: //Dolar =>> Real brasileño
                    try {
                        monedaOrigen = "USD";
                        monedaDestino = "BRL";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 4: //Real brasileño =>> Dolar
                    try {
                        monedaOrigen = "BRL";
                        monedaDestino = "USD";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 5: //Dolar =>> Peso colombiano
                    try {
                        monedaOrigen = "USD";
                        monedaDestino = "COP";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 6: //Peso colombiano =>> Dolar
                    try {
                        monedaOrigen = "COP";
                        monedaDestino = "USD";
                        CambioMoneda cambios = consultaCambios.consultarCambioMonedas(monedaOrigen);
                        System.out.println("Ingrese cantidad a cambiar:");
                        cantidadOrigen = teclado.nextDouble();
                        cantidadResultante = cambioResultante.calcularCambio(cantidadOrigen, monedaDestino, cambios);
                        System.out.println(String.format("El valor de %.2f [%s] corresponde al valor final de ==>> %.2f [%s]", cantidadOrigen, monedaOrigen, cantidadResultante, monedaDestino));
                    } catch (Exception e) {
                        System.out.println(String.format("Error al convertir [%s] a [%s]: " + e.getMessage(),monedaOrigen, monedaDestino));
                    }
                    break;
                case 7:
                    System.out.println("Salió del programa.");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }
}
