package e8;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("La edad debe estar entre 0 y 150 años.");
        }
        System.out.println("Edad válida: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(25); // No desencadena la excepción
            validateAge(-5); // Desencadena la excepción
        } catch (InvalidAgeException ex) { // Manejador de excepciones
            ex.printStackTrace();
        }

        try {
            validateAge(200); // Desencadena la excepción
        } catch (InvalidAgeException ex) { // Manejador de excepciones
            ex.printStackTrace();
        }
    }
}
