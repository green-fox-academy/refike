public class Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        //  Create a function called `factorio`
        //   that returns it's input's factorial


        int num1 = 4;

        System.out.println(factorio(num1));

    }
    public static int factorio (int a){
        int facto = 1;
        for (int i=1; i <= a; i++){
            facto  *= i;

        }
        return  facto;

    }
}
