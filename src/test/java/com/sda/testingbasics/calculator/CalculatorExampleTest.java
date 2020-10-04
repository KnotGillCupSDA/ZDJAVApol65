package com.sda.testingbasics.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorExampleTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void thatWeCanAddTwoPositiveNumbers() {
        double a = 2.0;
        double b = 3.0;
        double expected = 5.0;

        double sum = calculator.add(a, b);

        Assertions.assertEquals(expected, sum, "Wynik sumy " + a + " i " + b + " powinien być równy " + sum);
    }

    @Test
    void thatWeCanAddPositiveNumberToNegativeNumber() {
        double sum = calculator.add(2.0, -3.0);
        Assertions.assertEquals(-1, sum);
    }

    @Test
    void thatWeCanAddTwoNegativeNumbers() {
        double sum = calculator.add(-2.0, -3.0);
        Assertions.assertEquals(-5.0, sum);
    }
}