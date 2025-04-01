package e8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class TestMyMagicException {

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
    }





    }












