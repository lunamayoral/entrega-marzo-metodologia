package e1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileTCF {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("test.in"));
            // do something if no exception ...
            // you main logic here in the try-block
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            System.err.println("El archivo no se pudo encontrar: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
