import java.util.Scanner;


public class PalindromeBuilder {
    public static void main(String[] args) {
        //Create a function named create palindrome following your current language's style guide.
        // It should take a string, create a palindrome from it and then return it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a string: ");
        String userInput = scanner.nextLine();
        System.out.println(palindromeBuilder(userInput));

    }

    public static String palindromeBuilder(String userInput) {
        String palindrome = userInput;
        for (int i = 0; i < userInput.length(); i++) {
            palindrome = palindrome + palindrome.charAt(userInput.length() - i - 1);
        }
        return palindrome;
    }
}
