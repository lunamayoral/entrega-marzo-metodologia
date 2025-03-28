package e5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OperancionesConExcepcionesTest {

    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            OperancionesConExcepciones.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        // Compruebo los mensajes impresos en la consola
        String output = outputStream.toString();
        assertTrue(output.contains("Exception caught en MethodC"));
        assertTrue(output.contains("Exception caught in main"));
    }

    @Test
    void methodD() {
        assertThrows(XxxException.class, () -> OperancionesConExcepciones.methodD(1));// comprueba que lanza XxxException si i > 0
        assertThrows(YyyException.class, () -> OperancionesConExcepciones.methodD(-1));// Verifica que lanza YyyException si i < 0.
        assertDoesNotThrow(() -> OperancionesConExcepciones.methodD(0));// No debería lanzar excepciones cuando i = 0.

    }

    @Test
    void methodC() {
        assertDoesNotThrow(() -> OperancionesConExcepciones.methodC(1));// Captura XxxException y la maneja internamente.
        assertDoesNotThrow(() -> OperancionesConExcepciones.methodC(0));// No debería lanzar excepciones si 1 = 0
        assertDoesNotThrow(() -> OperancionesConExcepciones.methodC(-1));// Captura YyyException y la maneja internamente.
    }

    @Test
    void testMethodC() {
        assertThrows(XxxException.class, () -> OperancionesConExcepciones.methodC(1, 0));// Comprueba que lanza XxxException cuando i > 0.
        assertThrows(YyyException.class, () -> OperancionesConExcepciones.methodC(-1, 0));// Comprueba que lanza YyyException cuando i < 0.
    }
}