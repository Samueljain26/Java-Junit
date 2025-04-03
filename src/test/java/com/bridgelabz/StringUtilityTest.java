package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    @Test
    public void shouldReverseString(){
        Assertions.assertEquals("olleh",StringUtility.reverseString("hello"));
    }
    @Test
    public void shouldCheckPalindrome(){
        Assertions.assertTrue(StringUtility.isPalindrome("aabbaa"));
    }
    @Test
    public void shouldConvertUpperCase(){
        Assertions.assertEquals("HELLO",StringUtility.toUpperCase("hello"));
    }
}
