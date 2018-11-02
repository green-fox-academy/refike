import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
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
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.print("\n");

        }

        for (int c = 1; c <= number; c++) {
            System.out.print("%");

        }
    }

}
