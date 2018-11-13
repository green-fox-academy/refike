public class Sharpie {
    String color;
    double width;
    double inkAmount;


    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.;
    }

    public void use(){
        inkAmount--;
    }
}

class main {
    public static void main(String[] args) {


        Sharpie myRedSharpie = new Sharpie("red", 0.5);
        myRedSharpie.use();
        System.out.println("InkAmount decrease, new amount " + myRedSharpie.inkAmount);

    }
}
