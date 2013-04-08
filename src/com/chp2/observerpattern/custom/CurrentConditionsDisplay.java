package com.chp2.observerpattern.custom;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject whetherData;
    
    public void registerObserver(Subject wd){
        this.whetherData = wd;
        this.whetherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current conditions : " ).append(temperature).append(" F degrees and hummidity ").append(humidity);
        System.out.println(sb.toString());
        
    }
    
}
