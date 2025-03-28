package e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberFormatExceptionExampleTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> NumberFormatExceptionExample.main(new String[] {}));
    }

    @Test
    void triggerNumberFormatException() {
        NumberFormatExceptionExample example = new NumberFormatExceptionExample();
        assertDoesNotThrow(() -> example.triggerNumberFormatException());
    }
}