package PetrolStation;

public class Car {
    int carGasAmount;
    int capacity;

    public Car() {
        this.carGasAmount = 0;
        this.capacity = 100;
    }

    public void move() {
        carGasAmount-=5;
    }
}
