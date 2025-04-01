package e8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOExceptionExampleTest {

    @Test
    void main() {
        Exception exception = assertThrows(Exception.class, () -> {

                    IOExceptionExample.main(new String[]{});
                },
                "Se esperaba una IOException al intentar leer un archivo inexistente"
        );


        assertTrue(exception.getMessage() != null,
                "El mensaje de la excepción debe describir el problema al leer el archivo");
    }
    }
