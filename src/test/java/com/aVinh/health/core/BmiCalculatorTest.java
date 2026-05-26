package com.aVinh.health.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BmiCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "70, 1.75, 22.86",
            "50, 1.60, 19.53",
            "90, 1.80, 27.78",
            "100, 1.70, 34.60"
    })
    void testGetBmiWithManyInputs(double weight, double height, double expectedBmi) {
        BmiCalculator bmiCalculator = new BmiCalculator();

        double actualBmi = bmiCalculator.getBmi(weight, height);

        assertEquals(expectedBmi, actualBmi, 0.01);
    }
}