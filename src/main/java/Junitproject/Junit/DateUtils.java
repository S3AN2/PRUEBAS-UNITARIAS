package Junitproject.Junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateUtils {

    public boolean isLeapYear(int year) {
        return java.time.Year.isLeap(year);
    }

    public int daysBetween(LocalDate start, LocalDate end) {
        return (int) ChronoUnit.DAYS.between(start, end);
    }

    public String dayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
