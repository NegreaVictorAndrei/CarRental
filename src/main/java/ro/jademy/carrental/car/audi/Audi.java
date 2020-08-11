package ro.jademy.carrental.car.audi;

import ro.jademy.carrental.car.Car;

public class Audi extends Car {

    private String make;


    public Audi(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }



    public Audi( String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
        this.make = "Audi";
    }
}


