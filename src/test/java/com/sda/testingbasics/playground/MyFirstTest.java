package com.sda.testingbasics.playground;

import org.junit.jupiter.api.*;

public class MyFirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    void myFirstTestMethod() {

        System.out.println("myFirstTestMethod");
        //given
        int a = 2;
        int b = 3;
        int expected = 5;

        //when
        int result = a + b;

        //then
        Assertions.assertEquals(expected, result);

    }

    @Test
    void test2() {
        System.out.println("test2");
        Assertions.fail("no no no!");
    }
}
