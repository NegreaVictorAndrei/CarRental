package ro.jademy.carrental.car;

import java.time.LocalDate;

public class RentedCar {

    private boolean isRented;
    private LocalDate datePickedUp;
    private LocalDate dateToBeReturned;
    private int AmountToPay;

    public RentedCar(boolean isRented, LocalDate datePickedUp, LocalDate dateToBeReturned, int amountToPay) {
        this.isRented = isRented;
        this.datePickedUp = datePickedUp;
        this.dateToBeReturned = dateToBeReturned;
        AmountToPay = amountToPay;
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
                "isRented=" + isRented +
                ", datePickedUp=" + datePickedUp +
                ", dateToBeReturned=" + dateToBeReturned +
                ", AmountToPay=" + AmountToPay +
                '}';
    }
}
