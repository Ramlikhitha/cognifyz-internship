import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        displayStrength(password);
    }

    private static void displayStrength(String password) {
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        boolean hasMinLength = password.length() >= 8;
        
        System.out.println("password strength: ");

        if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar && hasMinLength) {
            System.out.println("Very strong");
        } else if ((hasUppercase && hasLowercase && hasDigit) || (hasUppercase && hasLowercase && hasSpecialChar) || (hasUppercase && hasDigit && hasSpecialChar) || (hasLowercase && hasDigit && hasSpecialChar)) {
            System.out.println("Strong");
        } else if ((hasUppercase && hasLowercase) || (hasUppercase && hasDigit) || (hasUppercase && hasSpecialChar) || (hasLowercase && hasDigit) || (hasLowercase && hasSpecialChar) || (hasDigit && hasSpecialChar)) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}