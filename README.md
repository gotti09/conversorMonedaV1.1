<h1>Challenge2 - Conversor de monedas, con API</h1>
Este proyecto esta estructarado en los 4 clases.

- Principal: muestra el menu de las conversiones de monedas
- CalculaCambio: que envia la cantidad a cambiar, la moneda destino al cual equivale y la tasa de cambios de la moneda origen a cambiar
- ConsultaCambioMoneda: realiza la consulta a la API, enviandole la moneda origen seleccionada, este devuelve un conjunto de valores de "codigo,valor"
- CambioMoneda: es una clase que recibe la estructura response en formato json
