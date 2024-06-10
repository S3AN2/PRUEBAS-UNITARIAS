package Junitproject.Junit;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    @Test
    public  void sumarPositivos(){
        int value= mathUtils.add(2,3);
        Assert.assertEquals(5,value);
        
    }

    @Test
    public  void sumarPositivoyNegativo(){
        int value= mathUtils.add(2,-3);
        Assert.assertEquals(-1,value);
    }

    @Test
    public  void sumarNegativos(){
        int value= mathUtils.add(-2,-3);
        Assert.assertEquals(-5,value);
    }
    @Test
    public  void restaPositiva(){
        int value= mathUtils.substract(5,3);
        Assert.assertEquals(2,value);
    }

    @Test
    public  void restaPositivoyNegativo(){
        int value= mathUtils.substract(2,-3);
        Assert.assertEquals(5,value);
    }

    @Test
    public  void restaNegativos(){
        int value= mathUtils.substract(-2,-3);
        Assert.assertEquals(1,value);
    }


    @Test
    public  void multiplicarPositivos(){
        int value= mathUtils.multiply(2,3);
        Assert.assertEquals(6,value);
    }

    @Test
    public  void multiplicarPositivoyNegativo(){
        int value= mathUtils.multiply(2,-3);
        Assert.assertEquals(-6,value);
    }

    @Test
    public  void multiplicarNegativos(){
        int value= mathUtils.multiply(-2,-3);
        Assert.assertEquals(6,value);
    }


    @Test
    public  void dividirPositivos(){
        int value= mathUtils.divide(6,3);
        Assert.assertEquals(2,value);
    }

    @Test
    public  void dividirPositivoyNegativo(){
        int value= mathUtils.divide(6,-3);
        Assert.assertEquals(-2,value);
    }

    @Test
    public  void dividirNegativos(){
        int value= mathUtils.divide(-6,-3);
        Assert.assertEquals(2,value);
    }
    @Test(expected = IllegalArgumentException.class)
    public void dividirError() {
        mathUtils.divide(6, 0);
    }
}
