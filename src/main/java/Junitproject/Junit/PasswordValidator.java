package Junitproject.Junit;
public class PasswordValidator {
    private static final String ERROR_MIN_LENGTH = "La contraseña debe tener al menos 8 caracteres";
    private static final String ERROR_UPPERCASE = "La contraseña debe tener mayuscula";
    private static final String ERROR_LOWERCASE = "La contraseña debe tener minuscula";
    private static final String ERROR_DIGIT = "La contraseña debe tener digito";
    private static final String SUCCESS = "La contraseña es correcta";

    public String isValid(String password) {
        String[] characters = password.split("");
        if (characters.length >= 8) {
            int countCharacterUpper = 0;
            int countCharacterLower = 0;
            int countCharacterDigit = 0;
            for (String character : characters) {
                char value = character.charAt(0);
                if (Character.isUpperCase(value)) countCharacterUpper++;
                if (Character.isLowerCase(value)) countCharacterLower++;
                if (Character.isDigit(value)) countCharacterDigit++;
            }
            if (countCharacterUpper == 0) return ERROR_UPPERCASE;
            if (countCharacterLower == 0) return ERROR_LOWERCASE;
            if (countCharacterDigit == 0) return ERROR_DIGIT;
                return SUCCESS;
            }
        return ERROR_MIN_LENGTH;
    }
}


