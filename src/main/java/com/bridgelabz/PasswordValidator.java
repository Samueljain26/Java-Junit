package com.bridgelabz;

import java.util.regex.*;

public class PasswordValidator {
    public static boolean validatePassword(String input){
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher =pattern.matcher(input);
        return matcher.matches();
    }
}
