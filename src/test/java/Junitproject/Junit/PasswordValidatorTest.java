package Junitproject.Junit;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator = new PasswordValidator();
    private PasswordValidator2 passwordValidator2 = new PasswordValidator2();
    @Test
    public void invalidMinCharactersPasswordTest1(){
    String resultPassword= passwordValidator.isValid("angello");
        Assert.assertEquals("La contraseña debe tener al menos 8 caracteres",resultPassword);
    }

    @Test
    public void invalidUppercaseCharacterInPasswordTest1() {
        String resultPassword = passwordValidator.isValid("angellos");
        Assert.assertEquals("La contraseña debe tener mayuscula", resultPassword);
    }
        @Test
        public void invalidLowercaseCharacterInPasswordTest1(){
            String resultPassword= passwordValidator.isValid("ANGELLOS");
            Assert.assertEquals("La contraseña debe tener minuscula",resultPassword);
        }

    @Test
    public void invalidDigitalcaseCharacterInPasswordTest1(){
        String resultPassword= passwordValidator.isValid("angelloS");
        Assert.assertEquals("La contraseña debe tener digito",resultPassword);
    }
    @Test
    public void validCompleteCharactersPasswordTest1(){
        String resultPassword= passwordValidator.isValid("angelloS2");
        Assert.assertEquals("La contraseña es correcta",resultPassword);
    }

    @Test
    public void invalidMinCharactersPasswordTest(){
        String resultPassword= passwordValidator2.isValid("angello");
        Assert.assertEquals("La contraseña debe tener al menos 8 caracteres",resultPassword);
    }

    @Test
    public void invalidUppercaseCharacterInPasswordTest() {
        String resultPassword = passwordValidator2.isValid("angellos");
        Assert.assertEquals("La contraseña debe tener mayuscula", resultPassword);
    }
    @Test
    public void invalidLowercaseCharacterInPasswordTest(){
        String resultPassword= passwordValidator2.isValid("ANGELLOS");
        Assert.assertEquals("La contraseña debe tener minuscula",resultPassword);
    }

    @Test
    public void invalidDigitalcaseCharacterInPasswordTest(){
        String resultPassword= passwordValidator2.isValid("angelloS");
        Assert.assertEquals("La contraseña debe tener digito",resultPassword);
    }
    @Test
    public void validCompleteCharactersPasswordTest(){
        String resultPassword= passwordValidator2.isValid("angelloS2");
        Assert.assertEquals("La contraseña es correcta",resultPassword);
    }
}
