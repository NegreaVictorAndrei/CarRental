package ro.jademy.carrental.data;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.audi.A4;
import ro.jademy.carrental.car.bmw.X3;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.ford.Focus;
import ro.jademy.carrental.car.mercedes.Cclass;
import ro.jademy.carrental.user.Customer;
import ro.jademy.carrental.user.Salesman;
import ro.jademy.carrental.user.User;

import java.util.ArrayList;
import java.util.List;

public class AppData {

    public static List <Car> appCarList() {
        List<Car> carList = new ArrayList<>();

        Car Audi = new A4("Audi", "A4", 2018, "Diesel", "Sedan", "Blue", "32.000$", "2.0 - 190 HP", "Manual", 4);
        Car Bmw = new X3("BMW", "X3", 2017, "Diesel", "SUV", "Black", "38.000$", "2.0 - 248 HP", "Automatic", 4);
        Car Dacia = new Logan("Dacia", "Logan", 2019, "Gasoline", "Sedan", "White", "13.000$", "1.6 - 105 HP", "Manual", 4);
        Car Ford = new Focus("Ford", "Focus", 2019, "Gasoline", "Sedan", "Red", "22.000$", "2.0 - 185 HP", "Manual", 4);
        Car Mercedes = new Cclass("Mercedes", "C 220 ", 2017, "Diesel", "Coupe", "White", "34.000$", "2.2 - 220 HP", "Manual", 4);

        carList.add(Audi);
        carList.add(Bmw);
        carList.add(Dacia);
        carList.add(Ford);
        carList.add(Mercedes);

        return appCarList();
    }

    public static List <User> appUserList(){

        User Andrei = new Customer("Andrei","Gigescu","Gigi","1234");
        User Ion = new Customer("Ion","V","Ion","1234",40);
        User Vasile = new Customer("Vasile","A","Vasile","1234",18);
        User Sale1 = new Salesman("Claudiu","G","Claudiu","1234");
        User Sale2 = new Salesman("Adrian","B","Adrian","1234");

        return appUserList();
    }



}
