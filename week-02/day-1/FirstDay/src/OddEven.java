import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        if(userInput1%2 ==0){
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
    }
}
