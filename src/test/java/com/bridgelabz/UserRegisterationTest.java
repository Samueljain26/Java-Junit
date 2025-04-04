package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {

    @Test
    public void shouldCheckException(){
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            UserRegistration.registerUser("","sam@gmail.com","sam@1234");
        });
    }
    @Test

    public void shouldNotCheckException(){
        Assertions.assertDoesNotThrow(()->{
            UserRegistration.registerUser("hello","sam@gmail.com","sam@1234");
        }
        );
    }

}
