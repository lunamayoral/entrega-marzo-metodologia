package e8;

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
}






