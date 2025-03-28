package e1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ScannerFromFileTCTest {

    @Test
    void testMainvalido() {
        ScannerFromFileTC.main(new String[]{});
    }

    @Test
    void testMaininvalido() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Guardar la salida original
        System.setOut(new PrintStream(outContent));

        ScannerFromFileTC.main(new String[]{"invalid_file.in"});

        String output = outContent.toString().trim();
        String expectedOutput = "Archivo no encontrado: test.in (El sistema no puede encontrar el archivo especificado)";

        assertEquals(expectedOutput, output);

        System.setOut(originalOut);
    }
}