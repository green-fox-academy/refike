package Clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student john = new Student("John",20,"male","BME");
        john.introduce();
        Student cloneJohn = john.clone();
        cloneJohn.introduce();
    }
}
