package jw.ffeflss;

public class Car {
    String brand;
    double fuel;

    Car(String brand, double fuel){
        this.brand = brand;
        this.fuel = fuel;
    }

    void drive(double km){
        double fuelnd = km * 0.1;

        if (fuel >=fuelnd){
            fuel -= fuelnd;
            System.out.println("Вы проехали"+ km + "км");
            System.out.println("осталось: " + fuel + "Топлива");
        }else{
            System.out.println("недостаточно топлива");
        }
    }
}
