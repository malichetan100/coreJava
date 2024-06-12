package com.chetan.leapyear;

public class LeapYear {

    public void cheakLeapYear(int year)
    {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year+" is Leap Year");
        }
        else
        {
            System.out.println(year+" is not Leap Year");
        }
    }
}
