package com.chetan.polymorphism.vehicletypes;

public class Car implements Vehicle{

    public String vehicleName()
    {
        return "Car";
    }

    @Override
    public String startEngine() {
        return "Car is started";
    }

    @Override
    public int seatNumbers() {
        return 53;
    }
}
