import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) throws Exception {
        // Clase Scanner que nos permite que el usuario ingrese los datos
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "eucalipto";
        int intentosMaximos = 3;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Convertir la palabra en un arreglo de caracteres
        char[] palabra = palabraSecreta.toCharArray();

        // Desordenar la palabra usando Fisher-Yates shuffle
        Random random = new Random();
        for (int i = 0; i < palabra.length; i++) {
            int randomIndex = random.nextInt(palabra.length);
            char temp = palabra[i];
            palabra[i] = palabra[randomIndex];
            palabra[randomIndex] = temp;
        }

        // Mostrar la palabra desordenada
        System.out.println("Adivina la siguiente palabra: " + String.valueOf(palabra));
        
        // Mientras el usuario no haya adivinado la palabra o se le acaben los intentos
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Introduce tu respuesta (palabra completa): ");
                                    //Acepta la entrada de una palabra completa
            String respuestaUsuario = scanner.nextLine().toLowerCase(); 
            
            // Verificar si la palabra ingresada es correcta
            if (respuestaUsuario.equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra.");
            } else {
                intentos++;
                System.out.println("Incorrecto. Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }
        }

        if (!palabraAdivinada) {
            System.out.println("¡Game Over! La palabra era: " + palabraSecreta);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
