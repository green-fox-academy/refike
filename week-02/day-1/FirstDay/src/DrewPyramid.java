import java.util.Scanner;

public class DrewPyramid {
    public static void main(String[] args) {
        //       Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String k = "*";

        for (int i = 0; i < number; i++){
            for (int j = 0; j < number - i; j++){
                System.out.print(" ");
            }
            System.out.println(k);
            k += "**";

        }
    }
}
