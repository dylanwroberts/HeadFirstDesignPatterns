package me.dylanroberts.headfirstdesignpatterns.strategypattern;

public class MuteQuack implements QuackBehavior {

    private int volume = 0;

    @Override
    public void quack() {
        System.out.println("*silence*");
    }
}
