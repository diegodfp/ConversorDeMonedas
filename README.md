# Currency Converter

Este proyecto es un convertidor de monedas simple que utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real. Creado para el desafio Alura.

## Descripción del Proyecto

El proyecto consiste en tres clases principales:

1. **ExchangeRateService**: Esta clase se encarga de interactuar con la API de ExchangeRate-API para obtener las tasas de cambio.
2. **CurrencyConverter**: Esta clase utiliza `ExchangeRateService` para convertir montos entre diferentes monedas.
3. **Main**: La clase principal que solicita la entrada del usuario y realiza la conversión de moneda utilizando `CurrencyConverter`.


## Dependencias

El proyecto utiliza las siguientes bibliotecas:

- [OkHttp](https://square.github.io/okhttp/) para realizar solicitudes HTTP.
- [JSON](https://github.com/stleary/JSON-java) para manipular respuestas JSON.



