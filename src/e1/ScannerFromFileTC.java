package e1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileTC {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
