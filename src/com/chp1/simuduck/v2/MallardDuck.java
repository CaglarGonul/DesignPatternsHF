package com.chp1.simuduck.v2;

public class MallardDuck extends Duck implements Flyable,Quackable{

    @Override
    public void display() {
        System.out.println("I am a mallard duck. I am green and black.");
    }

    @Override
    public void fly() {
        System.out.println("I fly in the sky");
    }

    @Override
    public void quack() {
        System.out.println("I quack like a normal duck. I am real.");
    }
    
}
