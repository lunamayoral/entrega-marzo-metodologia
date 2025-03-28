package e6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchFinallyTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Llamamos al método main
        TryCatchFinally.main(new String[] {});

        // Verificamos que la salida contenga los mensajes esperados
        String output = outContent.toString().trim();
        assertTrue(output.contains("Start of the main logic"));
        assertTrue(output.contains("Try opening a file ..."));
        assertTrue(output.contains("File Not Found caught ..."));
        assertTrue(output.contains("finally-block runs regardless of the state of exception"));
        assertTrue(output.contains("After try-catch-finally, life goes on..."));

        // Restauramos la salida estándar
        System.setOut(System.out);
    }



}