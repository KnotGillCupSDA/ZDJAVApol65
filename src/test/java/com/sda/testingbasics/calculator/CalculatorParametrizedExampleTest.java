package com.sda.testingbasics.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorParametrizedExampleTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "-1, 2, 1", "-2, 1, -1", "-5, -7, -12"})
    void testAdd(double a, double b, double expected) {
        double sum = calculator.add(a, b);
        Assertions.assertEquals(expected, sum, "Wynik sumy " + a + " i " + b + " powinien być równy " + sum);
    }
}