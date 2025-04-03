package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldAdd(){
        Assertions.assertEquals(5,Calculator.addition(2,3));
    }
    @Test
    public void shouldSubtract(){
        Assertions.assertEquals(2,Calculator.subtract(5,3));
    }
    @Test
    public void shouldMultiply(){
        Assertions.assertEquals(6,Calculator.multiply(2,3));
    }
    @Test
    public void shouldDivide(){
        Assertions.assertEquals(2,Calculator.divide(4,2));
    }
}
