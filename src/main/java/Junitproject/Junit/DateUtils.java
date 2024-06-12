package Junitproject.Junit;

public class DateUtils {
    public Boolean isLeapYear(int year){
            if(year%4==0){
                int date=year/100;
                if(year%100==0 && date%4!=0){
                    return  false;
                }
                return true;
            }
        return false;
    }
}
