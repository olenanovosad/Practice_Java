package meeting;

public class PasswordValidation {
    public static void main(String[] args) {
        String password1 = "t&ttGG";

        System.out.println(Validate(password1));
    }

    public static boolean Validate(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpper = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLower = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                hasSpecial = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
        }


        if (password.length() == 6 && !password.contains(" ") && hasSpecial && hasLower
                && hasDigit && hasUpper) {
            return true;
        }
        return false;
    }
}


