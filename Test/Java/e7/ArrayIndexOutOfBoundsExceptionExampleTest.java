package e7;

import e2.MethodCallStackDemo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIndexOutOfBoundsExceptionExampleTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> ArrayIndexOutOfBoundsExceptionExample.main(new String[]{}));
    }
    }
