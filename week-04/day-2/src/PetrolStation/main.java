package PetrolStation;

public class main {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();
        station.refill(car);

        System.out.println(car.carGasAmount);
        System.out.println(station.gasAmount);
        car.move();
        car.move();

        System.out.println(car.carGasAmount);
        station.refill(car);
        System.out.println(station.gasAmount);

        System.out.println(car.carGasAmount);
        car.move();
        car.move();
        car.move();
        car.move();
        System.out.println(car.carGasAmount);
        station.refill(car);

        System.out.println(station.gasAmount);
        System.out.println(car.carGasAmount);



    }
}
