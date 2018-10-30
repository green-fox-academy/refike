public class FunctionsMethodsPractice {
    public static void main(String[] args) {

        int a=2;
        helloAndBye();
        String name = "sea-dog";
        print("Hello");
        print(name);
        add(5,6);
        System.out.println(return5()/2);
    }

    public static void helloAndBye () {
        System.out.println("Hello World!");
        System.out.println("Bye World!");
    }
    public static void print (String text) {
        int a = 1;
        System.out.println(text);
    }
    public static int return5() {
        return 5;
    }

    public static void add(int a , int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}
