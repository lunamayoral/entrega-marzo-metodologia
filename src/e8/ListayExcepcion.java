package e8;
import java.util.Scanner;
import java.lang.ArithmeticException;
import java.lang.IllegalArgumentException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListayExcepcion<T> {
    private int numElementos;
    private T[] elementos;
    private int maxElementos;

    public ListayExcepcion(int i) {
    }

    // Constructor
    public void ListayException(int capacidad) {
        this.maxElementos = capacidad;
        this.elementos = (T[]) (new Object[this.maxElementos]);
        this.numElementos = 0;
    }

    protected void setElemento(int indice, T elemento) {
        if (indice >= 0 && indice < this.maxElementos) {
            this.elementos[indice] = elemento;
        } else {

            try {
                int[] anArray = new int[indice];
                // Intentar acceder a un índice fuera del rango del array
                System.out.println(anArray[indice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Exception caught: " + e.toString());
                e.printStackTrace();
            } finally {
                System.out.println("Execution of try-catch-finally block completed.");
            }




        }
    }

    protected T getElemento(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice >= 0 && indice < this.maxElementos) {
            return this.elementos[indice];
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
    }


    public  T division() throws ArithmeticException, IllegalArgumentException {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        Object input1 = scanner.nextLine();

        System.out.print("Ingresa el segundo valor: ");
        Object input2 = scanner.nextLine();
        try {
            Integer num1 = (Integer) input1;
            Integer num2 = (Integer) input2;


            int resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ClassCastException e) {
            System.out.println("Error: Uno de los valores no se puede convertir a Integer.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado.");
        }

        scanner.close();

        return null;
    }





    public class IOExceptionExample {
        public static void main(String[] args) {
            try {
                // Intentamos leer un archivo
                BufferedReader reader = new BufferedReader(new FileReader("archivo_inexistente.txt"));
                String linea;

                // Leemos línea por línea
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }

                reader.close();
            } catch (IOException e) {
                // Capturamos y manejamos
                System.out.println("Error: No se pudo leer el archivo. Verifica si el archivo existe.");
                e.printStackTrace(); // Imprime el stack trace
            }
        }
    }
    }







