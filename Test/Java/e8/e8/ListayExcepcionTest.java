

package e8;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ListayExcepcionTest {

    @Test
    void setElemento() {
        ListayExcepcion<Integer> lista = new ListayExcepcion<>(3);

        assertDoesNotThrow(() -> lista.setElemento(1, 10),
                "No debería lanzar excepción en un índice válido");

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> lista.setElemento(4, 20),
                "Se esperaba una ArrayIndexOutOfBoundsException para un índice fuera de rango");
    }

    @Test
    void getElemento() {

        ListayExcepcion<Integer> lista = new ListayExcepcion<>(3);
        lista.setElemento(0, 10);

        assertEquals(10, lista.getElemento(0),
                "Debería devolver el elemento correcto en el índice 0");

        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> lista.getElemento(3),
                "Se esperaba una ArrayIndexOutOfBoundsException al acceder a un índice fuera de rango");
    }

    @Test
    void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer valor: ");
        String input1 = scanner.nextLine();

        System.out.print("Ingresa el segundo valor: ");
        String input2 = scanner.nextLine();
        ListayExcepcion<Integer> lista = new ListayExcepcion<>(3);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> lista.division( ),
                "Se esperaba IllegalArgumentException para entradas no válidas."
        );
        assertTrue(thrown.getMessage().contains("Entrada no válida"),
                "El mensaje de la excepción debe ser claro.");
    }

    @Test
    void testDivisionHandlesZeroDivisor() {
        ListayExcepcion<Integer> lista = new ListayExcepcion<>(3);

        // Verificamos que lanza ArithmeticException si el divisor es cero
        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> lista.division(),
                "Se esperaba ArithmeticException al dividir entre cero."
        );
        assertEquals("No se puede dividir entre cero.", thrown.getMessage());
    }

    @Test
    void testDivisionValidInputs() {
        ListayExcepcion<Integer> lista = new ListayExcepcion<>(3);

        // Verificamos que retorna correctamente para entradas válidas
        assertEquals(5, lista.division(),
                "La división debe devolver el resultado correcto.");
    }





}

