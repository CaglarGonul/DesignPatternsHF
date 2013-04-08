package com.chp2.observerpattern.custom;

/**
 * The objects who will broadcast events will implement this interface
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
