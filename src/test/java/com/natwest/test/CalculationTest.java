package com.natwest.test;

import com.natwest.Calculation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationTest {
    Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Calculation();
    }

    @AfterEach
    void tearDown() {
        calculation = null;
    }

    @Test
    void addTest() {
        int result = calculation.add(2, 3);
        assertEquals(5, result);
    }
}
