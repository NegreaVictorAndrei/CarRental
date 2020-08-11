package ro.jademy.carrental.car;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private Integer year;
    private String fuelType; // diesel, gasoline, alternative
    private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV
    private String color;
    private String basePrice;
    private String engine;
    private String transmissionType; // automatic, manual
    private Integer doorNumber;


    // Q: how can we better represent the car make?
    // Q: how can we better represent the car type?
    // Q: how can we better represent the motor type?
    // Q: how can we better represent the transmission type?
    // Q: how can we better represent the engine?
    // Q: how can we better represent money value?
    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?

    //TODO : Create an Engine class?!


    public Car(String make, String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.carType = carType;
        this.color = color;
        this.basePrice = basePrice;
        this.engine = engine;
        this.transmissionType = transmissionType;
        this.doorNumber = doorNumber;
    }

    public Car(String model, Integer year, String fuelType, String carType, String color, String basePrice, String engine, String transmissionType, Integer doorNumber) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.carType = carType;
        this.color = color;
        this.basePrice = basePrice;
        this.engine = engine;
        this.transmissionType = transmissionType;
        this.doorNumber = doorNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                ", color='" + color + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ", engine='" + engine + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(fuelType, car.fuelType) &&
                Objects.equals(carType, car.carType) &&
                Objects.equals(color, car.color) &&
                Objects.equals(basePrice, car.basePrice) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(transmissionType, car.transmissionType) &&
                Objects.equals(doorNumber, car.doorNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, fuelType, carType, color, basePrice, engine, transmissionType, doorNumber);
    }
}



