package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void shouldCheckCtoF(){
        double result =TemperatureConverter.celsiusToFahrenheit(100);
        Assertions.assertEquals(212,result);
    }
    @Test
    public void shouldCheckFtoC(){
        double result = TemperatureConverter.fahrenheitToCelsius(212);
        Assertions.assertEquals(100,result);
    }
}
