package PetrolStation;

public class Station {
    int gasAmount;

    public Station() {
        this.gasAmount = 5000;
    }

    public void refill (Car car){
        gasAmount -= car.capacity-car.carGasAmount;


            car.carGasAmount+= car.capacity-car.carGasAmount;
    }
}


