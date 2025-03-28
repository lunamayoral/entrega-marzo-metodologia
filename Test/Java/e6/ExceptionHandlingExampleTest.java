package e6;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingExampleTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ExceptionHandlingExample.main(new String[] {});

        String output = outContent.toString().trim();
        assertFalse(output.contains("File not found:"));
        assertTrue(output.contains("Execution of try-catch-finally block completed."));

        System.setOut(System.out);
    }

    @Test
    void readFile() {
        assertThrows(FileNotFoundException.class, () -> {
            ExceptionHandlingExample.readFile("non_existent_file.txt");
        });
    }

    @Test
    void readFile_FileExists() throws Exception {
        String fileName = "test_file.txt";
        Files.write(Paths.get(fileName), "Hello, World!".getBytes());

        ExceptionHandlingExample.readFile(fileName);

        new File(fileName).delete();
    }


}