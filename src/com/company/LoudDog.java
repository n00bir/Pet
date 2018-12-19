package com.company;

public class LoudDog extends Pet {
    public LoudDog(String name){

        super(name);

    }
    public String speak(){

        return (super.speak() + super.speak());


    }
}
