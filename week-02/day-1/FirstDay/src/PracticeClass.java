import java.util.Scanner;

public class PracticeClass {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        int i, j, k, number;
        int l,m,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Add a number: ");
        number = input.nextInt();

        for (i=1; i<=number/2+1; i++) {


            for (j=i; j<number; j++){
                System.out.print(" ");
            }
            for (k=1; k<(i*2); k++){
            System.out.print("*");
        }
        System.out.print("\n");

        }

        for (l=number/2; l>0; l--) {

            for (n=l; n<number; n++){
                System.out.print(" ");
            }
            for (m=1; m<(l*2); m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
