package com.chetan.Inheritance.vehicle;

public class Truck extends Vehicle{
    String cargoCapacity;

    public Truck(int registerNumber, double rentalRates, String cargoCapacity) {
        super(registerNumber, rentalRates);
        this.cargoCapacity = cargoCapacity;
    }

    public void displayCargoCapacity()
    {
        System.out.println("The cargo capacity of truck is: "+cargoCapacity);
    }
}
