package com.chp2.observerpattern.builtin;

import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){}
    
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    
     public void setMeasurements(float temp,float hum,float pres){
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = pres;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
