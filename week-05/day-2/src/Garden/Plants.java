package Garden;

public class Plants {

    private String color;
    private int currentWaterAmount;
    private double canAbsorb;
    private int minWater;

    public Plants(String color, double canAbsorb, int minWater) {
        this.color = color;
        this.currentWaterAmount = 0;
        this.canAbsorb = canAbsorb;
        this.minWater = minWater;
    }

    public boolean needWater(){
        return (currentWaterAmount < minWater);
    }

    public void water(int amount) {
        if(needWater()) {
            currentWaterAmount += amount * canAbsorb;
        }
    }

    public String getColor() {
        return color;
    }
}
