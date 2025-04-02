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



    }










