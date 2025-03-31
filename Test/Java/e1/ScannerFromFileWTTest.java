package e1;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ScannerFromFileWTTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ScannerFromFileWT.main(new String[]{}));
    }

    @Test
    void readFile() {
        File testFile0 = new File("test.in");
        assertDoesNotThrow(() -> ScannerFromFileWT.readFile());

        File testFile = new File("test.in");
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("Primera línea\nSegunda línea\nTercera línea");
        } catch (IOException e) {
            throw new RuntimeException("Error al crear el archivo de prueba.", e);
        }
        assertDoesNotThrow(() -> ScannerFromFileWT.readFile());
        assertTrue(testFile.exists());
        testFile.delete();
    }

}