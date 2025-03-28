package e6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MethodCallStackDemoTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MethodCallStackDemo.main(new String[] {});
        });

        // Verificamos que la salida contenga los mensajes esperados
        String output = outContent.toString().trim();
        assertTrue(output.contains("Enter main()"));
        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("finally in methodA()"));

        assertEquals("/ by zero", exception.getMessage());

        System.setOut(System.out);
    }

    @Test
    void methodA() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            MethodCallStackDemo.methodA();
        });

        // Verificamos que la salida contenga los mensajes esperados
        String output = outContent.toString().trim();
        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("finally in methodA()"));
        assertFalse(output.contains("Exit methodA()"));

        System.setOut(System.out);
    }
}