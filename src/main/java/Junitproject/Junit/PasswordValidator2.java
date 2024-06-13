package Junitproject.Junit;

public class PasswordValidator2 {


    private static final String ERROR_MIN_LENGTH = "La contraseña debe tener al menos 8 caracteres";
    private static final String ERROR_UPPERCASE = "La contraseña debe tener mayuscula";
    private static final String ERROR_LOWERCASE = "La contraseña debe tener minuscula";
    private static final String ERROR_DIGIT = "La contraseña debe tener digito";
    private static final String SUCCESS = "La contraseña es correcta";
    private static final String ERROR_SPECIAL = "La contaseña debe tener caracter especial";


    public String isValid(String password) {
        // Verificar si la longitud de la contraseña es al menos 8 caracteres
        if (password.length() < 8) return ERROR_MIN_LENGTH;

        // Verificar si la contraseña contiene al menos una letra mayúscula
        if (!password.matches(".*[A-Z].*")) return ERROR_UPPERCASE;

        // Verificar si la contraseña contiene al menos una letra minúscula
        if (!password.matches(".*[a-z].*")) return ERROR_LOWERCASE;

        // Verificar si la contraseña contiene al menos un dígito
        if (!password.matches(".*\\d.*")) return ERROR_DIGIT;

        // Verificar si la contraseña contiene al menos un carácter especial
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) return ERROR_SPECIAL;
        // Si todas las verificaciones pasan, retornar éxito
        return SUCCESS;
    }
}

