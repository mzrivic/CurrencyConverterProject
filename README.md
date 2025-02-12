
# Currency Converter Project

Este es un proyecto de conversión de divisas desarrollado en Java. La aplicación permite convertir montos entre diferentes monedas utilizando tasas de cambio en tiempo real.

## Descripción

La aplicación toma como entrada una moneda base, una moneda de destino y un monto, y devuelve el monto convertido a la moneda de destino. La tasa de cambio se obtiene a través de una API externa.

Características:
- Conversión de múltiples monedas.
- Historial de conversiones guardado en un archivo JSON.
- Interfaz de línea de comandos simple y fácil de usar.

## Tecnologías utilizadas

- **Java 11** o superior.
- **Gson**: Para la serialización y deserialización de objetos JSON.
- **API de tasas de cambio**: Usada para obtener las tasas de cambio en tiempo real.

## Requisitos

1. Tener [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado en tu sistema.
2. Conexión a internet para acceder a la API de tasas de cambio.

## Instrucciones de instalación

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/mzrivic/CurrencyConverterProject.git
   ```

2. **Accede al directorio del proyecto**:

   ```bash
   cd CurrencyConverterProject
   ```

3. **Compila el proyecto**:

   Asegúrate de tener configurado Java correctamente y compila los archivos fuente:

   ```bash
   javac -cp ".;src/com/currencyconverter/lib/gson-2.10.1.jar" -d bin src/com/currencyconverter/main/Main.java src/com/currencyconverter/api/CurrencyConverterAPI.java src/com/currencyconverter/utils/HistoryManager.java
   ```

4. **Ejecuta la aplicación**:

   Para ejecutar el programa, usa el siguiente comando:

   ```bash
   java -cp ".;bin;src/com/currencyconverter/lib/gson-2.10.1.jar" com.currencyconverter.main.Main
   ```

5. **Interacción con la aplicación**:

   La aplicación te pedirá que ingreses la moneda base, la moneda destino y la cantidad para convertir.

   Ejemplo de entrada:
   - Moneda base: `USD`
   - Moneda destino: `EUR`
   - Monto: `10`

   El resultado será algo como:

   ```
   Converted amount: 9.73
   Conversion saved to history.
   ```

## Archivos de proyecto

- **`src/`**: Contiene el código fuente Java.
- **`bin/`**: Contiene los archivos compilados `.class`.
- **`conversion_history.json`**: Archivo donde se guarda el historial de conversiones realizadas.
- **`README.md`**: Este archivo.

## Contribuciones

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad (`git checkout -b feature-nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios a tu repositorio (`git push origin feature-nueva-funcionalidad`).
5. Abre un Pull Request en este repositorio.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Si tienes alguna pregunta, puedes contactarme en mi correo: [montlocsz@gmail.com](mailto:montlocsz@gmail.com).
