import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password length to be generated:");
        int length = scanner.nextInt();
        System.out.print("should we include digits? (yes/no): ");
        boolean involveDigits = scanner.next().equalsIgnoreCase("y");
        System.out.print("should we mention lowercase letters? (yes/no): ");
        boolean involveLowercase = scanner.next().equalsIgnoreCase("y");
        System.out.print("shouls we Include uppercase letters? (yes/no): ");
        boolean involveUppercase = scanner.next().equalsIgnoreCase("y");
        System.out.print("should we Include special characters? (y/n): ");
        boolean involveSpecial = scanner.next().equalsIgnoreCase("y");

        System.out.println(generatePassword(length, involveDigits, involveLowercase, involveUppercase, involveSpecial));
        
    }

    private static String generatePassword(int length, boolean involveDigits, boolean involveLowercase, boolean involveUppercase, boolean involveSpecial) {
        String passwordChars = "";
        if (involveDigits) {
            passwordChars += "0123456789";
        }
        if (involveLowercase) {
            passwordChars += "abcdefghijklmnopqrstuvwxyz";
        }
        if (involveUppercase) {
            passwordChars += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (involveSpecial) {
            passwordChars += "!@#$%^&*()-_=+{}[]|;:,.<>?";
        }

        if (passwordChars.length() == 0) {
            throw new IllegalStateException("At least one character set must be included");
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        System.out.println("Generated password is:");
        for (int i = 0; i < length; i++) {
            
            int randomIndex = random.nextInt(passwordChars.length());
            
            sb.append(passwordChars.charAt(randomIndex));
            
        }
        return sb.toString();
    }
}