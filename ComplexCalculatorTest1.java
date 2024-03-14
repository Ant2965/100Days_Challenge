package selenium_testingant;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class ComplexCalculatorTest1 {

    @Test
    public void testAdd() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(-7, calculator.subtract(-4, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-12, calculator.multiply(-4, 3));
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void testDivide() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
        assertEquals(-1.5, calculator.divide(-3, 2), 0.0001);
        try {
            calculator.divide(5, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }

    @Test
    public void testIsPrime() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertFalse(calculator.isPrime(1));
        assertFalse(calculator.isPrime(0));
        assertTrue(calculator.isPrime(2));
        assertTrue(calculator.isPrime(3));
        assertFalse(calculator.isPrime(4));
        assertTrue(calculator.isPrime(5));
        assertFalse(calculator.isPrime(6));
        assertTrue(calculator.isPrime(7));
        assertFalse(calculator.isPrime(8));
        assertTrue(calculator.isPrime(11));
    }

    @Test
    public void testFibonacciSeries() {
        ComplexCalculator calculator = new ComplexCalculator();
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, calculator.fibonacciSeries(5));
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8}, calculator.fibonacciSeries(7));
        assertArrayEquals(new int[]{0}, calculator.fibonacciSeries(1));
        try {
            calculator.fibonacciSeries(0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input!", e.getMessage());
        }
    }
}
