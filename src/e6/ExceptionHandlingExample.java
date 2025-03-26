package e6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            readFile("test.in");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Execution of try-catch-finally block completed.");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(new File(fileName));
        // Process the file here
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
