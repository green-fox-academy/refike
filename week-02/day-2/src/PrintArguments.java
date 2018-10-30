import java.util.ArrayList;

public class PrintArguments {
    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
        printIt("alma");
       printIt("alma","körte");
        printIt("alma","körte","narancs");
    }


    public static void printIt (String... argument) {
        for (int i = 0; i<argument.length; i++) {
            System.out.println(argument[i] + " " );

        }
        System.out.println("\n");




        }
    }

