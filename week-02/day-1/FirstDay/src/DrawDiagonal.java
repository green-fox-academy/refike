import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = scanner.nextInt();


        for (int i = 1; i <= number; i++) {
            System.out.print("%");
        }
        System.out.print("\n");

        for (int k = 1; k <= number - 2; k++) {
            System.out.print("%");
            for (int j = 1; j <= number - 2; j++) {
                if (k == j) {
                    System.out.print("%");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.print("%");
            System.out.print("\n");
        }

            for (int c = 1; c <= number; c++) {
                System.out.print("%");
            }
        }
    }


