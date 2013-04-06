package com.chp1.designpuzzle;

public abstract class Character {
    WeaponBehaviour weapon;
    
    public abstract void fight();
    
    public void setWeapon(WeaponBehaviour wp){
        this.weapon = wp;
    }
}
