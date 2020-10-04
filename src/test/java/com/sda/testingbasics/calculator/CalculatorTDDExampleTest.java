package com.sda.testingbasics.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTDDExampleTest {

    @Test
    void testFactorialHappyPath() {
        Calculator calculator = new Calculator();

        long factorial = calculator.factorial(5);
        Assertions.assertEquals(120, factorial);
    }

    @Test
    void thatWeCantCalculateFactorialForLargeNumbers() {
        Calculator calculator = new Calculator();

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.factorial(50));
    }
}
