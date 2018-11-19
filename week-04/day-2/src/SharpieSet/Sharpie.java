package SharpieSet;

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

    public void useALL(){
        inkAmount = 0;
    }
}


