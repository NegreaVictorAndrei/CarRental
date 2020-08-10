package ro.jademy.carrental.user;

import ro.jademy.carrental.car.Car;

public class Customer extends User{

    private int age;
    boolean hasPayedDeposit;



    public Customer(String firstName, String lastName, String useranme, String password) {
        super(firstName, lastName, useranme, password);
    }

    public Customer(String firstName, String lastName, String useranme, String password, int age) {
        super(firstName, lastName, useranme, password);
        this.age = age;
    }
}
