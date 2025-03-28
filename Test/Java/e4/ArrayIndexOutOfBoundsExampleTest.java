package e4;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExampleTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayIndexOutOfBoundsExample.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Error: El índice 10 está fuera de los límites del arreglo."));

        System.setOut(System.out);
    }

    @Test
    void accessArrayElement() {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Caso 1: Índice válido
        example.accessArrayElement(2);
        String output = outContent.toString();
        assertTrue(output.contains("El elemento en el índice 2 es: 3"));

        // Limpiar el contenido de salida
        outContent.reset();

        // Caso 2: Índice negativo
        example.accessArrayElement(-1);
        output = outContent.toString();
        assertTrue(output.contains("Error: El índice -1 está fuera de los límites del arreglo."));

        // Limpiar el contenido de salida
        outContent.reset();

        // Caso 3: Índice mayor que el tamaño del arreglo
        example.accessArrayElement(5);
        output = outContent.toString();
        assertTrue(output.contains("Error: El índice 5 está fuera de los límites del arreglo."));

        // Limpiar la salida estándar
        System.setOut(System.out);
    }
}