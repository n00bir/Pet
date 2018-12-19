package com.company;

public class Runner {

    public static void main(String[] args) {
	    Cat cat = new Cat("Cat");
	    Dog dog = new Dog("Dog");
        LoudDog louddog = new LoudDog("Loud Dog");
        System.out.println(cat.getName() + ": '" + cat.speak() + "'");
        System.out.println(dog.getName() + ": '" + dog.speak() + "'");
        new Kennel(cat,dog,loudDog).allSpeak();
        Kennel kennel = new Kennel();
        kennel.allSpeak();

    }
}
