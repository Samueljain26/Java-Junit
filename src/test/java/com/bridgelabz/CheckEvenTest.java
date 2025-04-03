package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CheckEvenTest {
    @ParameterizedTest
    @CsvSource({"2", "4", "6", "8"})
    public void shouldCheckEven(int number) {
        boolean a = CheckEven.isEven(number);
        Assertions.assertTrue(a);
    }

    @ParameterizedTest
    @CsvSource({"1", "3", "7", "23"})
    public void shouldCheckNotEven(int number) {
        boolean a = CheckEven.isEven(number);
        Assertions.assertFalse(a);
    }
}