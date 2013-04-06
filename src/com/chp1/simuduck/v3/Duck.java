package com.chp1.simuduck.v3;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;
    
    public Duck(){
        
    }
    
    public abstract void Display();
    
    public void performFly(){
        flyBehaviour.fly();
    }
    
    public void performQuack(){
        quackBehaviour.quack();
    }
    
    public void swim(){
        System.out.println("I can swim no matter what I am :))");
    }
    
    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    
    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}
