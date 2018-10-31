import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        //System.out.println(number);
        System.out.println("Guess a number between 1-10: ");

        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        int guessedNumber = scanner.nextInt();

        while(number != guessedNumber) {
            //if (number == guessedNumber) {
            //  System.out.println("The guess was correct, Well done");
            if (number > guessedNumber) {
                System.out.println("The stored number was higher, make an other guess!");
                attempts++;

            } else if(number < guessedNumber) {
                System.out.println("The stored number was lower,make an other guess!");
                attempts++;
            }

            guessedNumber = scanner.nextInt();

        }
            System.out.println("The guess was correct, " + "from " + attempts + " attempts" + " Well done!");
        }
    }

