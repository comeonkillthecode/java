package basic.calculator;

import org.akash.java.basic.calculator.BasicCalculator;
import org.akash.java.basic.calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicCalculatorTest {
    private Calculator calculator = null;

    @BeforeAll
    void init() {
        calculator = new BasicCalculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.sub(3, 2));
        assertEquals(5, calculator.sub(2, -3));
        assertEquals(-4, calculator.sub(-2, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.mul(2, 3));
        assertEquals(-6, calculator.mul(2, -3));
        assertEquals(4, calculator.mul(-2, -2));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.div(4, 2));
        assertEquals(-2, calculator.div(4, -2));
        assertEquals(1, calculator.div(-2, -2));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }
}
