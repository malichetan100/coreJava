package com.chetan.polymorphism.animalkingdom;

public interface Animal {

    void makeSound();
    void displayAnimalName();

    default void sleepTime()
    {
        System.out.println("Evening Time");
    }
}
