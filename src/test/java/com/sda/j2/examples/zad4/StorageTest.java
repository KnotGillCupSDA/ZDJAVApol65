package com.sda.j2.examples.zad4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    @Test
    void thatWeCanAddToStorage() {
        Storage storage = new Storage();
        storage.addToStorage("klucz1", "wartosc1");

        Assertions.assertNotNull(storage.findValues("wartosc1"));
        Assertions.assertEquals(1, storage.findValues("wartosc1").size());
        Assertions.assertEquals("klucz1", storage.findValues("wartosc1").get(0));
    }

    @Test
    void thatWeCanAddMultipleValuesUnderSameKey() {
        Storage storage = new Storage();
        storage.addToStorage("klucz1", "wartosc1");
        storage.addToStorage("klucz1", "wartosc2");

        Assertions.assertNotNull(storage.findValues("wartosc1"));
        Assertions.assertEquals(1, storage.findValues("wartosc1").size());
        Assertions.assertEquals("klucz1", storage.findValues("wartosc1").get(0));

        Assertions.assertNotNull(storage.findValues("wartosc2"));
        Assertions.assertEquals(1, storage.findValues("wartosc2").size());
        Assertions.assertEquals("klucz1", storage.findValues("wartosc2").get(0));
    }
}