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

        TryCatchFinally.main(new String[] {});

        String output = outContent.toString().trim();
        assertTrue(output.contains("Start of the main logic"));
        assertTrue(output.contains("Try opening a file ..."));
        assertTrue(output.contains("File Not Found caught ..."));
        assertTrue(output.contains("finally-block runs regardless of the state of exception"));
        assertTrue(output.contains("After try-catch-finally, life goes on..."));

        System.setOut(System.out);
    }



}