package e4;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        example.accessArrayElement(10);
    }

    public void accessArrayElement(int index) {
        int[] numbers = {1, 2, 3, 4, 5};

        if (index >= 0 && index < numbers.length) {
            System.out.println("El elemento en el índice " + index + " es: " + numbers[index]);
        } else {
            System.out.println("Error: El índice " + index + " está fuera de los límites del arreglo.");
        }
    }
}
