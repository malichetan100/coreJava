package com.chetan.Inheritance.vehicle;

public class Car extends Vehicle{
    int seats;

    public Car(int registerNumber, double rentalRates, int seats) {
        super(registerNumber, rentalRates);
        this.seats = seats;
    }

    public void displayNumberOfSeats()
    {
        System.out.println("The car has the "+seats+" of seats.");
    }
}
