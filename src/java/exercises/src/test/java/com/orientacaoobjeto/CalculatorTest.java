package com.orientacaoobjeto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Should calculate the distance")
    void shouldCalculateDistance() {
        double time = 3;
        double speed = 50;
        double distanceExpected = 150;

        Calculator calculator = new Calculator(time, speed);
        assertEquals(distanceExpected, calculator.getDistance());
    }
    @Test
    @DisplayName("Should throw exception")
    void shouldThrowException() {
        double time = 3;
        double speed = 0;

        assertThrows(IllegalArgumentException.class,
                ()-> new Calculator(time, speed));
    }
}