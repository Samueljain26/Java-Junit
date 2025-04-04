package com.bridgelabz;

public class UserRegistration {

    public static void registerUser(String username, String email, String password){
        if((username== null || username.trim().isEmpty())){
            throw new IllegalArgumentException("invalid username");
        }
        else if((email==null || email.trim().isEmpty())){
            throw new IllegalArgumentException("invalid email");
        }
        else if((password==null || password.trim().isEmpty())){
            throw new IllegalArgumentException("invalid password");
        }
    }
}
