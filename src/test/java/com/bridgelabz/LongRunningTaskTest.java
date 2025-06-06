package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class LongRunningTaskTest {

    @Test
    @Timeout(value =2, unit = TimeUnit.SECONDS)
    void shouldLongRunningTask() throws InterruptedException {
        String result = LongRunningTask.longRunningTask();
        Assertions.assertEquals("Done", result);
    }
}
