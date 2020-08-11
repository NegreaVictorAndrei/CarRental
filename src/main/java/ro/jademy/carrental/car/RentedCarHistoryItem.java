package ro.jademy.carrental.car;

import java.time.LocalDate;

public class RentedCarHistoryItem {

    private Car car;
    private boolean isRented;
    private LocalDate datePickedUp;
    private LocalDate dateToBeReturned;
    private int AmountToPay;

    public RentedCarHistoryItem(Car car, boolean isRented, LocalDate datePickedUp, LocalDate dateToBeReturned, int amountToPay) {
        this.car = car;
        this.isRented = isRented;
        this.datePickedUp = datePickedUp;
        this.dateToBeReturned = dateToBeReturned;
        AmountToPay = amountToPay;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public LocalDate getDatePickedUp() {
        return datePickedUp;
    }

    public void setDatePickedUp(LocalDate datePickedUp) {
        this.datePickedUp = datePickedUp;
    }

    public LocalDate getDateToBeReturned() {
        return dateToBeReturned;
    }

    public void setDateToBeReturned(LocalDate dateToBeReturned) {
        this.dateToBeReturned = dateToBeReturned;
    }

    public int getAmountToPay() {
        return AmountToPay;
    }

    public void setAmountToPay(int amountToPay) {
        AmountToPay = amountToPay;
    }

    @Override
    public String toString() {
        return "RentedCar{" +
                "car=" + car +
                ", isRented=" + isRented +
                ", datePickedUp=" + datePickedUp +
                ", dateToBeReturned=" + dateToBeReturned +
                ", AmountToPay=" + AmountToPay +
                '}';
    }
}
