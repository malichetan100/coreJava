package com.chetan.polymorphism.animalkingdom;

public class Cat extends Dog{

    @Override
    public  void makeSound()
    {
        System.out.println("Meow Meow!!!!!!!!!!!");
    }

    public void displayAnimalName()
    {
        System.out.println("Animal name is Cat");
    }
}
