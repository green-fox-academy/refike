import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        System.out.println("Add a number: ");

        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();

        int[][] myArray = new int[myInt][myInt];
        for (int i = 0; i < myInt; i++) {

            for (int j = 0; j < myInt; j++) {
                if(i==j){
                    myArray[i][j] = 1;

                }
               // else { myArray[i] [j] =0;
                System.out.print(myArray[i][j]); // miért nyomtat j-re 0-át ?
            }

            System.out.println();
        }
    }
}
