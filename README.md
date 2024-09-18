# Juego de Adivinar la Palabra en Java

Este juego de **Adivinar la Palabra** pone a prueba las habilidades del jugador para reorganizar una palabra cuyas letras están desordenadas. El objetivo es que el usuario adivine correctamente la palabra dentro de un número limitado de intentos. Si logra adivinarla correctamente antes de agotar sus intentos, gana el juego; de lo contrario, pierde.

## ¿Qué herramientas utilizamos?
1. **Clase Scanner** para permitir la entrada del usuario.
2. **Arreglos** para almacenar las letras de la palabra desordenada.
3. **Clase Random** para desordenar las letras de la palabra.
4. **Estructura de control: iterativa (Bucle)** para permitir múltiples intentos.
5. **Estructura de control condicional** para validar las respuestas del jugador.
6. **Clase String** y métodos como `toCharArray`, `valueOf`, y `equals` para manejar la palabra.
7. **Métodos de la clase Character** como `toLowerCase` para normalizar las entradas del usuario.

## Descripción del código:
1. El programa comienza desordenando las letras de una palabra secreta.
2. Muestra la palabra desordenada y solicita al usuario que ingrese la palabra correcta.
3. Utiliza un bucle para permitir múltiples intentos hasta que se agote el número máximo de intentos o el jugador adivine correctamente la palabra.
4. Si el jugador acierta la palabra, el programa termina con un mensaje de victoria. En caso contrario, muestra un mensaje de "Game Over".

## Retos encontrados y cómo fueron solucionados:
1. **Problema con la captura de la entrada completa del usuario:**
   - Inicialmente, el programa solo capturaba la primera letra de la palabra ingresada por el usuario. Esto se solucionó reemplazando `next().charAt(0)` por `nextLine()`, lo que permitió capturar la palabra completa.

2. **Desordenar la palabra correctamente:**
   - El reto fue implementar un algoritmo para desordenar las letras de manera aleatoria. Para esto, se usó el algoritmo Fisher-Yates Shuffle, que permite intercambiar posiciones de manera eficiente.

3. **Comparación de palabras:**
   - Otro reto fue comparar correctamente la palabra ingresada con la palabra secreta. Se resolvió usando el método `equals` para hacer comparaciones exactas entre cadenas de texto.

4. **Controlar los intentos del jugador:**
   - Asegurar que el número de intentos se redujera solo cuando la palabra ingresada fuera incorrecta fue clave. Esto se logró con un condicional que comparaba la palabra ingresada y, si era incorrecta, restaba un intento.

## Funcionalidades:
- **Interfaz de consola simple:** El usuario interactúa con el juego a través de la consola, ingresando la palabra que cree correcta.
- **Validación de intentos:** El número máximo de intentos es controlado y el juego termina cuando se alcanzan todos los intentos fallidos.
- **Desorden aleatorio:** La palabra cambia de orden cada vez que se inicia el juego.

Este juego es ideal para practicar conceptos como manipulación de strings, bucles, condicionales, y la interacción con el usuario en Java.