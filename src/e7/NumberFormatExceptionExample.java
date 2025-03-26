package e7;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        NumberFormatExceptionExample example = new NumberFormatExceptionExample();
        example.triggerNumberFormatException();
    }

    public void triggerNumberFormatException() {
        String invalidNumber = "abc";

        try {
            int number = Integer.parseInt(invalidNumber);
            System.out.println("El número es: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no tiene un formato numérico válido.");
            e.printStackTrace();
        }
    }
}
