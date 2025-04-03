package com.bridgelabz;

import java.util.*;

public class StringUtility {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }
}
