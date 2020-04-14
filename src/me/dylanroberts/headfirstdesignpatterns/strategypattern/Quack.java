package me.dylanroberts.headfirstdesignpatterns.strategypattern;

public class Quack implements QuackBehavior {

    private int volume = 100;

    @Override
    public void quack() {
        System.out.println("quack quack quack");
    }
}
