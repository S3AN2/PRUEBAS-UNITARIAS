package Junitproject.Junit;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
    private DateUtils dateUtils= new DateUtils();

    @Test
    public  void isLeapYearForMultipleFourTest(){
        Boolean value= dateUtils.isLeapYear(2424);
        Assert.assertEquals(true,value);
    }
    @Test
    public  void isnotLeapYearForMultipleFourTest(){
        Boolean value= dateUtils.isLeapYear(123);
        Assert.assertEquals(false,value);
    }
    @Test
    public  void isnotLeapYearForMultipleOneHundredForNotFourHundredTest(){
        Boolean value= dateUtils.isLeapYear(2200);
        Assert.assertEquals(false,value);
    }
    @Test
    public  void isnLeapYearForMultipleOneHundredForFourHundredTest(){
        Boolean value= dateUtils.isLeapYear(2400);
        Assert.assertEquals(true,value);
    }
}
