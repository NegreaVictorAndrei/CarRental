package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;

public class Dacia extends Car {

    private String make;

    public Dacia(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }

    public Dacia( String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
        this.make = "Dacia";
    }
}
