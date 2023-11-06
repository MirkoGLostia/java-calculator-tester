package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Random randomGenerator = new Random(13);

    @Test
    @DisplayName("sum of two numbers")
    void add() {
        for (int i = 0; i < 100; i++) {
            float x = randomGenerator.nextFloat();
            float y = randomGenerator.nextFloat();
            assertEquals(x+y, Calculator.add(x, y));
        }
    }

    @Test
    @DisplayName("subtraction of two numbers")
    void subtract() {
        float x = Calculator.subtract(1, 3);
        assertEquals(-2, x);
        assertNotEquals(11, x);
    }

    @Test
    @DisplayName("division of two numbers")
    void divide() {
        float x = Calculator.divide(10, 5);
        assertEquals(2, x);
        assertNotEquals(11, x);
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
    }

    @Test
    @DisplayName("multiplication of two numbers")
    void multiply() {
        float x = Calculator.multiply(7, 3);
        assertEquals(21, x);
        assertNotEquals(11, x);
    }
}