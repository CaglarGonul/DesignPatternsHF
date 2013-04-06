package com.chp1.simuduck.v3;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("I do not even make a sound.");
    }
    
}
