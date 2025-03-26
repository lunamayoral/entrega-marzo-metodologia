package e7;
//este es un ejemplo de IllegalArgumentException
public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho debe ser un valor positivo.");
        }
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto debe ser un valor positivo.");
        }
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public static void main(String[] args) {
        try {
            Rectangulo rectangulo = new Rectangulo(-5, 10); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Rectangulo rectangulo2 = new Rectangulo(5, 0); // Esto también lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Creación de un rectángulo válido
        Rectangulo rectangulo3 = new Rectangulo(5, 10);
        System.out.println("Área: " + rectangulo3.calcularArea());
        System.out.println("Perímetro: " + rectangulo3.calcularPerimetro());
    }
}
