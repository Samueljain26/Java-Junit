package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

        @Test
        void canNotDivideByZero(){
            Calculator calculator=new Calculator();
            Assertions.assertThrows(ArithmeticException.class,()->{
                Exception.divisionBy0(4,0);
            });
        }
    }