public class GreeterFunction {
    public static void main(String[] args) {
        //  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

        String a1 = "Greenfox";
        greet(a1);
    }
    public static  void greet (String name) {
        System.out.println("Greetings dear, "+name+"!");
    }
}
