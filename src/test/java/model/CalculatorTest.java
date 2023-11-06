package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    @DisplayName("sum of two numbers")
    void add() {
        float x = calculator.add(7, 3);
        assertEquals(10, x);
        assertNotEquals(11, x);
    }

    @Test
    @DisplayName("subtraction of two numbers")
    void subtract() {
        float x = calculator.subtract(1, 3);
        assertEquals(-2, x);
        assertNotEquals(11, x);
    }

    @Test
    @DisplayName("division of two numbers")
    void divide() {
        float x = calculator.divide(10, 5);
        assertEquals(2, x);
        assertNotEquals(11, x);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    @DisplayName("multiplication of two numbers")
    void multiply() {
        float x = calculator.multiply(7, 3);
        assertEquals(21, x);
        assertNotEquals(11, x);
    }
}