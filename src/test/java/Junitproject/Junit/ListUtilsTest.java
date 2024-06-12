package Junitproject.Junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import java.util.List;

public class ListUtilsTest {
    private ListUtils listUtils =   new ListUtils();

    @Test
    public  void sumTest(){
        int value=listUtils.sum(Arrays.asList(1,2,3,4,6));
        Assert.assertEquals(16,value);
    }

    @Test
    public  void listWithNullElementTest(){
        int value=listUtils.sum(Arrays.asList());
        Assert.assertEquals(0,value);
    }
    @Test
    public void maxValueMultipleElementListTest(){

        int value=listUtils.max(Arrays.asList(1,53,63,3));
        Assert.assertEquals(63,value);
    }
    @Test
    public void maxValueSingleElementListTest(){

        int value=listUtils.max(Arrays.asList(1));
        Assert.assertEquals(1,value);
    }
    @Test
    public  void maxValueWithNullListTest(){
       List<Integer> numbers = null;
        Assert.assertEquals(-1, listUtils.max(numbers));
    }
    @Test
    public void minValueMultipleElementListTest(){

        int value=listUtils.min(Arrays.asList(1,53,63,3));
        Assert.assertEquals(1,value);
    }

    @Test
    public void minValueSingleElementListTest(){

        int value=listUtils.min(Arrays.asList(1));
        Assert.assertEquals(1,value);
    }
    @Test
    public  void minValueWithNullListTest(){
        List<Integer> numbers = null;
        Assert.assertEquals(-1, listUtils.min(numbers));
    }


    @Test
    public void averageValueMultipleElementListTest(){

       double value =listUtils.average(Arrays.asList(2,5,11));
        Assert.assertEquals(6,value,0.01);
    }

    @Test
    public void averageValueSingleElementListTest(){

        double value=listUtils.average(Arrays.asList(1));
        Assert.assertEquals(1,value,0.01);
    }
    @Test
    public  void averageValueWithNullListTest(){
        List<Integer> numbers = null;
        Assert.assertEquals(-1, listUtils.average(numbers),0.01);
    }



}
