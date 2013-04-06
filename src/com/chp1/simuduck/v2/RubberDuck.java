package com.chp1.simuduck.v2;

public class RubberDuck extends Duck implements Quackable{

    
    @Override
    public void display() {
        System.out.println("I am a yellow duck. I swim in bath.");
    }

    @Override
    public void quack() {
        System.out.println("I quack like a duck");
    }
    
}
