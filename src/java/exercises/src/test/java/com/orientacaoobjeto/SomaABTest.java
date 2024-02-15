package com.orientacaoobjeto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomaABTest {

    @Test
    @DisplayName("Should sum A + B")
    void shouldSumAB() {
        double somaAB = 4;
        double a = 2;
        double b = 2;
        double c = 4;

        SomaAB soma = new SomaAB(somaAB, a, b, c);
        assertEquals(c, soma.getSomaAB());
    }
}