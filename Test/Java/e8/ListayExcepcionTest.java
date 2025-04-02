

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


    }







