package com.sda.testingbasics.air;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirplaneExampleTest {

    private Airplane airplane;

    @BeforeEach
    void setUp() {
        airplane = new Airplane();
    }

    @Test
    void thatWeStartFromZeroLevel() {
        Assertions.assertEquals(0, airplane.getHeight());
    }

    @Test
    void ascentHappyPath() {
        airplane.ascent(100);
        Assertions.assertEquals(100, airplane.getHeight());
    }

    @Test
    void descentHappyPath() {
        airplane.ascent(100);
        airplane.descent(50);
        Assertions.assertEquals(50, airplane.getHeight());
    }

    @Test
    void multipleAscents() {
        airplane.ascent(100);
        airplane.ascent(120);
        airplane.ascent(130);
        Assertions.assertEquals(350, airplane.getHeight());
    }

    @Test
    void thatWeCantGoBelowZero() {
        airplane.descent(50);
        Assertions.assertEquals(0, airplane.getHeight());
    }
}