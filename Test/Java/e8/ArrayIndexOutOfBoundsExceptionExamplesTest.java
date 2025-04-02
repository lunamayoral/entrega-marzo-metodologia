package e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExceptionExamplesTest {

    @Test
    void testArrayIndexOutOfBoundsException() {
        // Configuración
        int[] anArray = new int[3];

        // Verificación de la excepción
        ArrayIndexOutOfBoundsException thrown = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> {
                    // Acción que genera la excepción
                    System.out.println(anArray[3]);
                },
                "Expected ArrayIndexOutOfBoundsException to be thrown"
        );

        // Comprobación adicional (opcional)
        assertEquals("Index 3 out of bounds for length 3", thrown.getMessage());
    }
}