import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Remove spaces and punctuation, and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        if (isPalindrome(cleanedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}