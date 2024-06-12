package com.chetan.polymorphism.vehicletypes;

public class Truck extends MotorCycle{

    public String vehicleName()
    {
        return "Truck";
    }
    public String startEngine()
    {
        return "Truck is started Successfully";
    }

    public int seatNumbers()
    {
        return 20;
    }
}
