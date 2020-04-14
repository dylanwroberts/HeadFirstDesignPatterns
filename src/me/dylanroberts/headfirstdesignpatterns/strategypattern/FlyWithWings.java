package me.dylanroberts.headfirstdesignpatterns.strategypattern;

public class FlyWithWings implements FlyBehavior {

    private int speed = 10;

    @Override
    public void fly() {
        System.out.println("flap flap flap");
    }
}
