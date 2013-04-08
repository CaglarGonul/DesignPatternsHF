package com.chp2.observerpattern.custom;

import java.util.ArrayList;

/**
 * This class is the broadcaster
 */
public class WheatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float hummidity;
    private float pressure;
    
    public WheatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer b_Observer : observers) {
            b_Observer.update(temperature, hummidity, pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temp,float hum,float pres){
        this.temperature = temp;
        this.hummidity = hum;
        this.pressure = pres;
        measurementsChanged();
    }
    
}
