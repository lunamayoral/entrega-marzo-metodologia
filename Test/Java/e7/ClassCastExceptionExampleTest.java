package e7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassCastExceptionExampleTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ClassCastExceptionExample.main(new String[] {}));
    }

    @Test
    void triggerClassCastException() {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        assertDoesNotThrow(() -> example.triggerClassCastException());
    }
}