package e8;



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
            lista.setElemento(0, "Primer Elemento"); // Índice válido
            lista.setElemento(10, "Elemento Inválido"); // Índice inválido, lanzará una excepción

            // Recuperar un elemento válido
            System.out.println("Elemento en índice 0: " + lista.getElemento(0));

            // Intentar recuperar un elemento fuera del rango
            System.out.println("Elemento en índice 10: " + lista.getElemento(10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Excepción de índice fuera de rango capturada en main: " + e.getMessage());
            e.printStackTrace();
        }
    }
    }

