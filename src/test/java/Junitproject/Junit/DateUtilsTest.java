package Junitproject.Junit;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {
    private DateUtils dateUtils= new DateUtils();

    @Test
    public  void isLeapYearForMultipleFourTest(){
        boolean value= dateUtils.isLeapYear(2424);
        Assert.assertTrue(value);
    }
    @Test
    public  void isnotLeapYearForMultipleFourTest(){
        boolean value= dateUtils.isLeapYear(123);
        Assert.assertFalse(value);
    }
    @Test
    public  void isnotLeapYearForMultipleOneHundredForNotFourHundredTest(){
        boolean value= dateUtils.isLeapYear(2200);
        Assert.assertFalse(value);
    }
    @Test
    public  void isnLeapYearForMultipleOneHundredForFourHundredTest(){
        boolean value= dateUtils.isLeapYear(2400);
        Assert.assertTrue(value);
    }

    @Test
    public  void dayBetweenTest(){
        LocalDate start=LocalDate.of(2023,12,5);
        LocalDate end=LocalDate.of(2023,12,25);
        int daysBetweenValue  = dateUtils.daysBetween(start,end);
        Assert.assertEquals(20,daysBetweenValue);
    }

    @Test
    public  void dayOfWeekTest(){
        LocalDate end=LocalDate.of(2024,6,17);
        String  daysNameWeek  = dateUtils.dayOfWeek(end);
        Assert.assertEquals("Monday",daysNameWeek);

}}
