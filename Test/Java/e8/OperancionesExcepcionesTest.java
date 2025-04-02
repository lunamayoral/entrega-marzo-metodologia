package e8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperancionesExcepcionesTest {

    @Test
    void testMethodDThrowsXxxException() {
        // Verificamos que methodD lanza XxxException cuando i > 0
        Exception exception = assertThrows(XxxException.class,
                () -> OperancionesExcepciones.methodD(1),
                "Se esperaba XxxException cuando i > 0");
        assertEquals("An Xxx error occurred in methodD", exception.getMessage());
    }

    @Test
    void testMethodDThrowsYyyException() {
        // Verificamos que methodD lanza YyyException cuando i < 0
        Exception exception = assertThrows(YyyException.class,
                () -> OperancionesExcepciones.methodD(-1),
                "Se esperaba YyyException cuando i < 0");
        assertEquals("An Yyy error occurred in methodD", exception.getMessage());
    }

    @Test
    void testMethodCHandlesXxxException() {
        // Verificamos que methodC maneja XxxException internamente
        assertDoesNotThrow(() -> OperancionesExcepciones.methodC(1),
                "methodC debería manejar XxxException sin propagarla");
    }

    @Test
    void testMethodCHandlesYyyException() {
        // Verificamos que methodC maneja YyyException internamente
        assertDoesNotThrow(() -> OperancionesExcepciones.methodC(-1),
                "methodC debería manejar YyyException sin propagarla");
    }

    @Test
    void testMethodCWithTwoParamsThrowsXxxException() {
        // Verificamos que methodC con dos parámetros lanza XxxException cuando i > 0
        Exception exception = assertThrows(XxxException.class,
                () -> OperancionesExcepciones.methodC(1, 0),
                "Se esperaba XxxException cuando i > 0 en methodC(int, int)");
        assertEquals("An Xxx error occurred in methodD", exception.getMessage());
    }

    @Test
    void testMethodCWithTwoParamsThrowsYyyException() {
        // Verificamos que methodC con dos parámetros lanza YyyException cuando i < 0
        Exception exception = assertThrows(YyyException.class,
                () -> OperancionesExcepciones.methodC(-1, 0),
                "Se esperaba YyyException cuando i < 0 en methodC(int, int)");
        assertEquals("An Yyy error occurred in methodD", exception.getMessage());
    }
}