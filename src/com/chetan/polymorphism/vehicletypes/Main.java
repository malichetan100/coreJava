package com.chetan.polymorphism.vehicletypes;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Truck();
        System.out.println(vehicle.startEngine());
        System.out.println(vehicle.seatNumbers());

        Truck truck=new Truck();
        System.out.println(truck.vehicleName());

        System.out.println("======================================");

        Vehicle vehicle1=new Car();
        System.out.println(vehicle1.seatNumbers());
        System.out.println(vehicle1.startEngine());

        Car car=new Car();
        System.out.println(car.vehicleName());

        System.out.println("======================================");

        Vehicle vehicle2=new MotorCycle();
        System.out.println(vehicle2.seatNumbers());
        System.out.println(vehicle2.startEngine());

        MotorCycle motorCycle=new MotorCycle();
        System.out.println(motorCycle.vehicleName());


    }
}
