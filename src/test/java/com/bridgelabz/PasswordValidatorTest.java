package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    public void shouldValidateCorrectPassword(){
        Assertions.assertTrue(PasswordValidator.validatePassword("Hello@1234"));
    }
    @Test

    public void shouldNotValidateIncorrectPassword(){
        Assertions.assertFalse(PasswordValidator.validatePassword("Hello1234"));
    }
}
