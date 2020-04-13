package me.dylanroberts.headfirstdesignpatterns.duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Show a mallard duck");
    }
}
