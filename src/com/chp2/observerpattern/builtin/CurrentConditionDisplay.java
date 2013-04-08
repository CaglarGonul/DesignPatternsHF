package com.chp2.observerpattern.builtin;

import com.chp2.observerpattern.custom.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    Observable observable;
    
    public void registerObserver(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData wd = (WeatherData)o;
            this.temperature = wd.getTemperature();
            this.humidity = wd.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current conditions : " ).append(temperature).append(" F degrees and hummidity ").append(humidity);
        System.out.println(sb.toString());
    }
    
    
    
}
