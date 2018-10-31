import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//
//        for (int j = 1; j <=number; j++) {
//            System.out.print("%");
//        }
//        System.out.print("\n");
//        for (int i=1; i<number-1; i++) {
//            System.out.print("%");
//            for (int l= 1; l<=number-2; l++){
//                System.out.print(" ");
//            }
//            System.out.print("%");
//            System.out.print("\n");
//        }
//        for (int k = 1; k <=number; k++) {
//            System.out.print("%");
//        }

        for (int a=1; a<=number;a++){
            System.out.print("%");
        }
        System.out.print("\n");
        for (int b=1; b<number-1; b++){
            System.out.print("%");
            for (int c=1; c<=number-2;c++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.print("\n");
        }
        for (int d=1; d<=number; d++){
            System.out.print("%");
        }

    }

    }

