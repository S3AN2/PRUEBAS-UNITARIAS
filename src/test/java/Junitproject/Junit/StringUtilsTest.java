package Junitproject.Junit;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();
@Test
    public  void reverseTest(){
    String resultadoReverse = stringUtils.reverse("angello");
    Assert.assertEquals("ollegna",resultadoReverse);
}

@Test
public  void chartShortTest(){
    String resultadoReverse = stringUtils.reverse("a");
    Assert.assertEquals("a",resultadoReverse);
}
    @Test
    public  void chartNullTest(){
        String dato = stringUtils.reverse("");
        Assert.assertEquals("error cadena vacia",dato);
    }

@Test
    public void isPalindromeTrueTest(){
    boolean resultadoPalindrome = stringUtils.isPalindrome("ana");
    Assert.assertTrue("no es palindromo",resultadoPalindrome);
}

@Test
    public  void notIsPalindromeTest(){
    boolean resultadoNotPalindrome = stringUtils.isPalindrome("angello");
    Assert.assertFalse("es palindromo",resultadoNotPalindrome);
}

@Test
    public  void  countChartOcurrenceTest(){
   Object resultCountOccurrences=stringUtils.countOccurrences("angello",'l');
    Assert.assertEquals(2,resultCountOccurrences);
}

@Test
public  void  countNotChartOcurrenceTest(){
    Object resultCountNotOccurrences=stringUtils.countOccurrences("angello",'o');
    Assert.assertEquals("Sin ocurrencias",resultCountNotOccurrences);
}
}
