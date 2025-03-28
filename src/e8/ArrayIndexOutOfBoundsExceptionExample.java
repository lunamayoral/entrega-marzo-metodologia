package e8;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] anArray = new int[3];
            // Intentar acceder a un índice fuera del rango del array
            System.out.println(anArray[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception caught: " + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Execution of try-catch-finally block completed.");
        }
    }
}
