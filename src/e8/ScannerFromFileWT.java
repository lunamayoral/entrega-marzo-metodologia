package e8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFileWT {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: Archivo no encontrado. Revisa la ruta y vuelve a intentar.");
            ex.printStackTrace();
        }
    }
    public static void readFile() throws FileNotFoundException {
        Scanner in = new Scanner(new File("test.in"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}
