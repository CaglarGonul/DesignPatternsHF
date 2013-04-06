package com.chp1.designpuzzle;

public class King extends Character{

    @Override
    public void fight() {
        System.out.println("I fight like a king. " + weapon.useWeapon());
    }
    
}
