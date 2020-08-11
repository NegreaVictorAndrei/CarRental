package ro.jademy.carrental.car.ford;

import ro.jademy.carrental.car.Car;

public class Ford extends Car {

    private String make;

    public Ford(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }


    public Ford( String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
        this.make = "Ford";
    }
}
