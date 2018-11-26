package Sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount;


    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100.;
    }

    public double use(){
        inkAmount--;
        return inkAmount;
    }

    public double useALL(){
        return inkAmount = 0;
    }
}

