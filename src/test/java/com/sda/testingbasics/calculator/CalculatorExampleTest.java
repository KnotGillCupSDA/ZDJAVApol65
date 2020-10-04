package com.sda.testingbasics.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorExampleTest {

    @Test
    void thatWeCanAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
        int expected = 5;

        double sum = calculator.add(a, b);

        Assertions.assertEquals(expected, sum, "Wynik sumy " + a + " i " + b + " powinien być równy " + sum);
    }

    @Test
    void thatWeCanAddPositiveNumberToNegativeNumber() {
        Calculator calculator = new Calculator();

        double sum = calculator.add(2, -3);

        Assertions.assertEquals(-1, sum);
    }

    @Test
    void thatWeCanAddTwoNegativeNumbers() {
        Calculator calculator = new Calculator();

        double sum = calculator.add(-2, -3);

        Assertions.assertEquals(-5, sum);
    }
}