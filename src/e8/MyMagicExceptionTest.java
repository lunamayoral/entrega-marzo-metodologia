package e8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MyMagicExceptionTest {

    public static void magic(int number) throws MyMagicException {
        if (number == 8) {
            throw (new MyMagicException("you hit the magic number"));
        }
        System.out.println("hello");  // Se omite si se lanza la excepción
    }

    public static void main(String[] args) {
        try {
            magic(9);   // No lanza excepción
            magic(8);   // Lanza excepción
        } catch (MyMagicException ex) {   // Manejador de excepciones
            ex.printStackTrace();
        }


        ListayExcepcion<String> lista = new ListayExcepcion<>(5); // Instancia la lista con capacidad 5

        try {
            // Llamar a setElemento para agregar elementos
            lista.setElemento(0, "Primer Elemento");
            lista.setElemento(10, "Elemento Inválido");
            System.out.println("Elemento en índice 0: " + lista.getElemento(0));
            System.out.println("Elemento en índice 10: " + lista.getElemento(10));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Excepción de índice fuera de rango capturada en main: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            lista.division();
        } catch (IllegalArgumentException ia) {
            System.out.println("No puede convetir a integer" + ia.getMessage());
        } catch (ArithmeticException ar) {
            System.out.println("Error, denominador nulo" + ar.getMessage());
        }


        try{
            // Intentamos leer un archivo
            BufferedReader reader = new BufferedReader(new FileReader("archivo_inexistente.txt"));
            String linea;

            // Leemos línea por línea
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            reader.close();
        } catch(IOException e){
            // Capturamos y manejamos
            System.out.println("Error: No se pudo leer el archivo. Verifica si el archivo existe.");
            e.printStackTrace(); // Imprime el stack trace
        }




        class MyMagicException extends Exception {
            public MyMagicException(String message) {
                super(message);
            }
        }





    }





    }







