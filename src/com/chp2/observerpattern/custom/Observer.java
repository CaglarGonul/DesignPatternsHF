package com.chp2.observerpattern.custom;

/**
 * The objects who will be subscribers to the broadcaster will implement this interface.
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
