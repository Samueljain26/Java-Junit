package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static String formatDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return formattedDate;
    }
}
