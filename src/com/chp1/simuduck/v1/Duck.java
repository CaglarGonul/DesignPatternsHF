package com.chp1.simuduck.v1;

public abstract class Duck {
    public void quack(){
        System.out.println("I quack.");
    }
    
    public void swim(){
        System.out.println("I swim.");
    }
    
    public abstract void display();
    
    public void fly(){
        System.out.println("I fly.");
    }
}
