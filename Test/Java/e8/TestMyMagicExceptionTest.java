package e8;


import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestMyMagicExceptionTest {

    @Test
    void MagicThrowsMyMagicException() {
        // Verificamos que magic lanza MyMagicException cuando el número es 8
        Exception exception = assertThrows(
                MyMagicException.class,
                () -> TestMyMagicException.magic(8),
                "Se esperaba MyMagicException para el número mágico 8"
        );
        assertEquals("you hit the magic number", exception.getMessage());
    }

    @Test
    void testMagicDoesNotThrowException() {
        // Verificamos que magic no lanza excepción para números distintos de 8
        assertDoesNotThrow(() -> TestMyMagicException.magic(9),
                "magic no debería lanzar excepción para el número 9");
    }


}