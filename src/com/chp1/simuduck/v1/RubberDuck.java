package com.chp1.simuduck.v1;

public class RubberDuck extends Duck{

    @Override
    public void quack(){
        System.out.println("I quack like a duck.");
    }
    
    @Override
    public void display() {
        System.out.println("I am a yellow duck. I swim in bath.");
    }
    
    @Override
    public void fly(){
        System.out.println("I do not fly.");
    }
}
