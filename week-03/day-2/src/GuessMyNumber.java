import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (101-1)) + 1;
        System.out.println(randomNumber);
        System.out.println("Make a guess between 0-100 [You have 5 lives}: ");
        Scanner scanner = new Scanner(System.in);

        int lives = 5;
        while (lives > 0) {
            int guessedNumber = scanner.nextInt();

            if (guessedNumber > randomNumber) {
                lives--;
                System.out.println(guessedNumber + " Your number is bigger, only " + lives + " lives left");

            } else if (guessedNumber < randomNumber) {
                lives--;
                System.out.println(guessedNumber + " Your number was smaller, only " + lives + " lives left");

            } else {
                System.out.println("Your number was right, *GG WP*");
                break;
            }
        }
    }
}