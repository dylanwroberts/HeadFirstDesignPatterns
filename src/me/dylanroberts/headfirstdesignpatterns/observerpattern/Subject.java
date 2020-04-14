package me.dylanroberts.headfirstdesignpatterns.observerpattern;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void broadcast();
}
