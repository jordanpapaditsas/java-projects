package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        String password = "Cracklier351?";

        if (validatePassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password not valid");
        }
    }

    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-])[A-Za-z\\d#?!@$%^&*-]{8,}$";

    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
