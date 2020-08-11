package ro.jademy.carrental.car.mercedes;

import ro.jademy.carrental.car.Car;

public class Mercedes extends Car {

    private String make;

    public Mercedes(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }


    public Mercedes(String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        super(model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
        this.make = "Mercedes";
    }

}
