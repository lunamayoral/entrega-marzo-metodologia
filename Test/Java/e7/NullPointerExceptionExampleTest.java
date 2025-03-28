package e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullPointerExceptionExampleTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> NullPointerExceptionExample.main(new String[] {}));
    }

    @Test
    void triggerNullPointerException() {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        assertDoesNotThrow(() -> example.triggerNullPointerException());
    }
}