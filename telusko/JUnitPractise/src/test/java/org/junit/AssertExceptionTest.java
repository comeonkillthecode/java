package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertExceptionTest {
    @Test
    void testValueReturnsValueForPositiveInput() throws Exception {
        AssertExceptions assertExceptions = new AssertExceptions();
        int val = assertExceptions.value(5);
        assertEquals(5, val);
    }
    @Test
    void testValueThrowsExceptionForNonPositiveInput() {
        AssertExceptions assertExceptions = new AssertExceptions();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            assertExceptions.value(-9);
        }, "Expected value() to throw, but it didn't");

        assertEquals("You should pass positive number", thrown.getMessage());
    }
}
