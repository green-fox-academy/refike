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


        printParams("first");
        printParams("first","second");
        printParams("first","second","third");
    }


    public static void printParams (String... argument) {
        for (int i = 0; i<argument.length; i++) {
            System.out.print(argument[i] + " " );

        }
        System.out.print("\n");

    }
}

