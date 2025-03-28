package e1;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ScannerFromFileWTTest {

    @Test
    void main() {
        try {
            ScannerFromFileWT.main(new String[]{});
        } catch (Exception e) {
            assertEquals(true, false, "Main method threw an exception: " + e.getMessage());
        }
    }

    @Test
    void readFile() {

    }
}