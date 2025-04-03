package com.bridgelabz;

public class Exception {
    public static float divisionBy0(float a,float b)  {
        if(b==0){
            throw new ArithmeticException("Can not divide by zero");
        }
        return a/b;
    }
}
