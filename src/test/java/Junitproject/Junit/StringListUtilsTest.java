package Junitproject.Junit;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StringListUtilsTest {
    private StringListUtils stringListUtils = new StringListUtils();


    @Test
    public void concatenateTest() {
        String value = stringListUtils.concatenate(Arrays.asList("Angello", "Jujesito"));
        Assert.assertEquals("AngelloJujesito", value);
    }


    @Test
    public void concatenateListNullTest() {
        String value = stringListUtils.concatenate(Arrays.asList());
        Assert.assertEquals("Lista vacía", value);
    }


    @Test
    public void filterByPrefixNoMatchesTest() {
        List<String> value = stringListUtils.filterByPrefix(Arrays.asList("angello", "angel", "juje"), "r");
        Assert.assertEquals(Arrays.asList("No hizo match"), value);
    }

    @Test
    public void filterByPrefixMatchesTest() {
        List<String> value = stringListUtils.filterByPrefix(Arrays.asList("angello", "angel", "juje"), "a");
        Assert.assertEquals(Arrays.asList("angello","angel"), value);
    }
    @Test
    public void filterByPrefixNullTest() {
        List<String> value = stringListUtils.filterByPrefix(Arrays.asList("angello", "angel", "juje"), "");
        Assert.assertEquals(null, value);
    }

    @Test
    public void upperCaseEmptyListTest() {
        List<String> value = stringListUtils.toUpperCase(Arrays.asList());
        Assert.assertNull(value);
    }



    @Test
    public void upperCaseListTest() {
        List<String> value = stringListUtils.toUpperCase(Arrays.asList("angello","juje"));
        Assert.assertEquals(Arrays.asList("ANGELLO","JUJE"), value);
    }

}
