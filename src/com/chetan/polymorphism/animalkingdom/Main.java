package com.chetan.polymorphism.animalkingdom;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.displayAnimalName();
        animal.makeSound();
        animal.sleepTime();


        Animal animal1=new Cat();
        animal1.displayAnimalName();
        animal1.makeSound();
        animal1.sleepTime();
    }
}
