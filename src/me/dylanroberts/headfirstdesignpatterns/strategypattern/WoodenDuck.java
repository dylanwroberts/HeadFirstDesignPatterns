package me.dylanroberts.headfirstdesignpatterns.strategypattern;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        super.setFlyBehavior(new NoFly());
        super.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Show a wooden duck");
    }
}
