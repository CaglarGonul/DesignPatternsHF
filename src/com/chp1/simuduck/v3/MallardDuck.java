package com.chp1.simuduck.v3;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void Display() {
        System.out.println("I display like a mallard duck.");
    }
    
}
