import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4



        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number: ");

        int number = scanner.nextInt();
        System.out.println("Add " + number + " number: ");
        double sum=0;
        for (int i=1; i<=number; i++) {
            sum += scanner.nextInt();

        }

        System.out.println("The sum of the " + number + " number: " + sum);
        System.out.println("The Average is: " + sum/number);





    }
}
