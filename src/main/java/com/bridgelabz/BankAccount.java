package com.bridgelabz;

public class BankAccount {
    private static double balance = 0.0;
    private static boolean success;

    public static void deposit(double amount){
        balance += amount;
    }
    public static boolean withdraw(double amount){
        if(amount>balance){
            System.out.println("failed");
            success =false;
            return success;
        }
        balance -= amount;
        success=true;
        return success;
    }
    public static double getBalance(){
        return balance;
    }
}