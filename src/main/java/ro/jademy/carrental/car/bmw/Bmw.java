package ro.jademy.carrental.car.bmw;

import ro.jademy.carrental.car.Car;

public class Bmw extends Car {

    private String make;

    public Bmw(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }

    public Bmw( String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
        this.make = "BMW";
    }
}
