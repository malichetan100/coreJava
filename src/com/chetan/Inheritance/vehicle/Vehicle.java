package com.chetan.Inheritance.vehicle;

public class Vehicle {

    int registerNumber;
    double rentalRates;

    public Vehicle(int registerNumber, double rentalRates) {
        this.registerNumber = registerNumber;
        this.rentalRates = rentalRates;
//        System.out.println("The vehicle register number is: "+registerNumber);
//        System.out.println("The vehicle rental rates number is: "+rentalRates);
    }

    public void displayVehicleDetails()
    {
        System.out.println("The vehicle register number is: "+registerNumber);
        System.out.println("The vehicle rental rates number is: "+rentalRates);
    }
}
