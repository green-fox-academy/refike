import java.util.Scanner;

public class DrewTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

            String star = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add a number: ");

        int number = scanner.nextInt();

            for (int i=0; i<number; i++) {


                    star+="*";
                System.out.println(star);

            }
    }
}
