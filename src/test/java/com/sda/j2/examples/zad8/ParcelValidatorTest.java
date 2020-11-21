package com.sda.j2.examples.zad8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ParcelValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new ParcelValidator();
    }

    @Test
    void testStandardPackageHappyPath() {
        Parcel parcel = new Parcel(10, 10, 10, 20.0f, false);
        Assertions.assertTrue(validator.validate(parcel));
    }

    @Test
    void testExpressPackageHappyPath() {
        Parcel parcel = new Parcel(10, 10, 10, 10.0f, true);
        Assertions.assertTrue(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenSumOfLengthsIsTooHigh() {
        Parcel parcel = new Parcel(290, 10, 10, 1, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenAnyDimensionIsTooHigh() {
        List<Parcel> parcels = Arrays.asList(
                new Parcel(31, 1, 1, 1, false),
                new Parcel(1, 34, 1, 1, false),
                new Parcel(1, 1, 35, 1, false));

        for (Parcel parcel : parcels) {
            Assertions.assertFalse(validator.validate(parcel));
        }
    }

    @Test
    void thatIsNotValidWhenTooHeavyStandard() {
        Parcel parcel = new Parcel(10, 10, 10, 34, false);
        Assertions.assertFalse(validator.validate(parcel));
    }

    @Test
    void thatIsNotValidWhenTooHeavyExpress() {
        Parcel parcel = new Parcel(10, 10, 10, 17, true);
        Assertions.assertFalse(validator.validate(parcel));
    }
}