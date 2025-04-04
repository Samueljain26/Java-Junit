package com.bridgelabz;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius){
        double result = (celsius*9)/5 +32;
        return result;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double result= ((fahrenheit-32)*5)/9;
        return result;
    }

}
