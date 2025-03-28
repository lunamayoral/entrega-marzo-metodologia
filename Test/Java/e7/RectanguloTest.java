package e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void calcularArea() {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        assertEquals(50, rectangulo.calcularArea(), 0.001);
    }

    @Test
    void calcularPerimetro() {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        assertEquals(30, rectangulo.calcularPerimetro(), 0.001);
    }

    @Test
    void main() {
        assertDoesNotThrow(() -> Rectangulo.main(new String[] {}));
    }
}