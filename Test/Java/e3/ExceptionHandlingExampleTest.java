package e3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
class ExceptionHandlingExampleTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ExceptionHandlingExample.main(new String[]{});
    }

    @Test
    void methodA() {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        Exception exception = assertThrows(XxxException.class, () -> {
            example.methodA();
        });
        assertEquals("An error occurred in methodD", exception.getMessage());
    }


    @Test
    void methodB() {ExceptionHandlingExample example = new ExceptionHandlingExample();
        Exception exception = assertThrows(XxxException.class, () -> {
            example.methodB();
        });

        assertEquals("An error occurred in methodD", exception.getMessage());
    }

    @Test
    void methodC() {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        Exception exception = assertThrows(XxxException.class, () -> {
            example.methodC();
        });

        assertEquals("An error occurred in methodD", exception.getMessage());
    }

    @Test
    void methodD() {ExceptionHandlingExample example = new ExceptionHandlingExample();
        Exception exception = assertThrows(XxxException.class, () -> {
            example.methodD();
        });

        assertEquals("An error occurred in methodD", exception.getMessage());
    }
}