package com.bridgelabz;

public class LongRunningTask {
    public static String longRunningTask() throws InterruptedException{
        Thread.sleep(3000);
        return "Done";
    }

}
