package e7;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ConexionBaseDatosTest {

    @Test
    void conectar() {
        ConexionBaseDatos conexion = new ConexionBaseDatos();
        conexion.conectar();
        Exception exception = assertThrows(IllegalStateException.class, conexion::conectar);
        assertEquals("La conexión ya está establecida. Debe cerrarse antes de volver a conectarse.", exception.getMessage());

    }

    @Test
    void cerrar() {
        ConexionBaseDatos conexion = new ConexionBaseDatos();

        Exception exception = assertThrows(IllegalStateException.class, conexion::cerrar);
        assertEquals("No se puede cerrar la conexión porque no está establecida.", exception.getMessage());
        conexion.conectar();
        conexion.cerrar();

        exception = assertThrows(IllegalStateException.class, conexion::cerrar);
        assertEquals("No se puede cerrar la conexión porque no está establecida.", exception.getMessage());
    }

    @Test
    void realizarConsulta() {
        ConexionBaseDatos conexion = new ConexionBaseDatos();

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            conexion.realizarConsulta("SELECT * FROM usuarios");
        });
        assertEquals("No se puede realizar la consulta porque la conexión no está establecida.", exception.getMessage());

        conexion.conectar();
        conexion.realizarConsulta("SELECT * FROM usuarios");

        conexion.cerrar();
    }

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConexionBaseDatos.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Error: No se puede realizar la consulta porque la conexión no está establecida."));
        assertTrue(output.contains("Error: La conexión ya está establecida. Debe cerrarse antes de volver a conectarse."));
        assertTrue(output.contains("Error: No se puede cerrar la conexión porque no está establecida."));
        System.setOut(System.out);
    }
}