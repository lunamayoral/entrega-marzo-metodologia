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

    public ListayExcepcion(int capacidad) {
        this.maxElementos = capacidad;
        this.elementos = (T[]) new Object[this.maxElementos];
        this.numElementos = 0;
    }


    protected void setElemento(int indice, T elemento) {
        if (indice >= 0 && indice < this.maxElementos) {
            this.elementos[indice] = elemento;
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }

    }


    protected T getElemento(int indice) throws ArrayIndexOutOfBoundsException {
        if (indice >= 0 && indice < this.maxElementos) {
            return this.elementos[indice];
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango: " + indice);
        }
    }


    public Integer division() throws ArithmeticException, IllegalArgumentException {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        String input1 = scanner.nextLine();

        System.out.print("Ingresa el segundo valor: ");
        String input2 = scanner.nextLine();

        try {
            // Intentamos convertir las entradas a números enteros
            Integer num1 = Integer.parseInt(input1);
            Integer num2 = Integer.parseInt(input2);

            // Verificamos la división entre cero
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero.");
            }

            // Realizamos la división y retornamos el resultado
            Integer resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
            return resultado;

        } catch (NumberFormatException e) {
            // Lanzamos una excepción más descriptiva si los datos no son enteros
            throw new IllegalArgumentException("Error: Entrada no válida. Por favor ingresa números enteros.", e);
        } finally {
            System.out.println("Programa finalizado.");
            scanner.close();
        }
    }
}









