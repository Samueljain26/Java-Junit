package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test

    public void shouldCheckDateConversion(){
        String result = DateFormatter.formatDate("2024-12-21");
        Assertions.assertEquals("21-12-2024",result);

    }
}
