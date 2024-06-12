package com.chetan.Inheritance.vehicle;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(22,45.2,4);
        car.displayVehicleDetails();
        car.displayNumberOfSeats();
        Truck truck=new Truck(23,1000.00,"Large");
        truck.displayVehicleDetails();
        truck.displayCargoCapacity();
    }
}
