package e1;

import e5.OperancionesConExcepciones;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ScannerFromFileTCFTest {

    @Test
    void main() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            ScannerFromFileTCF.main(new String[]{});
            System.out.println("me cago en tos tus muertos");
        } finally {
            System.setOut(originalOut);
        }

        // Verificar el mensaje de error.
        String output = outputStream.toString();
        assertTrue(output.contains("El archivo no se pudo encontrar"));
    }
}