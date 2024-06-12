package com.chetan.reactangle;

public class AreaAndPerimeterOfRectangle {

    public void calculateAreaAndPerimeterOfRectangle(int length,int weadth)
    {
        int areaOfRectangle=length*weadth;
        System.out.println("The Area of Rectangle is: "+areaOfRectangle);

        int perimeterOfRectangle=2*(length+weadth);
        System.out.println("The perimeter of Rectangle is: "+perimeterOfRectangle);
    }
}
