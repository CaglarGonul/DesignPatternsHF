package com.chp1.designpuzzle;

public class Queen extends Character{

    @Override
    public void fight() {
        System.out.println("I fight like a queen ." + weapon.useWeapon());
    } 
    
}
