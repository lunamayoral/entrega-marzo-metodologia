package e8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            // Intentamos leer un archivo
            BufferedReader reader = new BufferedReader(new FileReader("archivo_inexistente.txt"));
            String linea;

            // Leemos línea por línea
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            reader.close();
        } catch (IOException e) {
            // Capturamos y manejamos
            System.out.println("Error: No se pudo leer el archivo. Verifica si el archivo existe.");
            e.printStackTrace(); // Imprime el stack trace
        }
    }
}


