package me.dylanroberts.headfirstdesignpatterns.duck;

public class NoFly implements FlyBehavior {

    private int speed = 0;

    @Override
    public void fly() {
        System.out.println("no flying");
    }
}
