package e7;

public class ConexionBaseDatos {
    private boolean conectado;

    public ConexionBaseDatos() {
        this.conectado = false;
    }

    public void conectar() {
        if (conectado) {
            throw new IllegalStateException("La conexión ya está establecida. Debe cerrarse antes de volver a conectarse.");
        }
        conectado = true;
        System.out.println("Conexión establecida.");
    }

    public void cerrar() {
        if (!conectado) {
            throw new IllegalStateException("No se puede cerrar la conexión porque no está establecida.");
        }
        // Lógica para cerrar la conexión
        conectado = false;
        System.out.println("Conexión cerrada.");
    }

    public void realizarConsulta(String consulta) {
        if (!conectado) {
            throw new IllegalStateException("No se puede realizar la consulta porque la conexión no está establecida.");
        }
        System.out.println("Consulta realizada: " + consulta);
    }

    public static void main(String[] args) {
        ConexionBaseDatos conexion = new ConexionBaseDatos();

        try {
            conexion.realizarConsulta("SELECT * FROM usuarios"); // Esto lanzará una excepción
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            conexion.conectar(); // Establece la conexión
            conexion.conectar(); // Esto lanzará una excepción
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            conexion.cerrar(); // Cierra la conexión
            conexion.cerrar(); // Esto lanzará una excepción
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            conexion.conectar(); // Establece la conexión
            conexion.realizarConsulta("SELECT * FROM usuarios"); // Realiza la consulta
            conexion.cerrar(); // Cierra la conexión
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
