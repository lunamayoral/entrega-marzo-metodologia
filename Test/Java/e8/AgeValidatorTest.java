package e8;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AgeValidatorTest {

    @Test
    void validateAge() {
        // Prueba con una edad válida
        assertDoesNotThrow(() -> AgeValidator.validateAge(25), "La edad 25 debería ser válida.");

        // Prueba con una edad negativa
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            AgeValidator.validateAge(-5);
        });
        assertEquals("La edad debe estar entre 0 y 150 años.", exception.getMessage());

        // Prueba con una edad mayor a 150
        exception = assertThrows(InvalidAgeException.class, () -> {
            AgeValidator.validateAge(200);
        });
        assertEquals("La edad debe estar entre 0 y 150 años.", exception.getMessage());

        // Prueba con la edad 0
        assertDoesNotThrow(() -> AgeValidator.validateAge(0), "La edad 0 debería ser válida.");

        // Prueba con la edad 150
        assertDoesNotThrow(() -> AgeValidator.validateAge(150), "La edad 150 debería ser válida.");
    }

    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Llamar al método main
        AgeValidator.main(new String[]{});

        // Restaurar la salida estándar
        System.setOut(originalOut);
        }
}