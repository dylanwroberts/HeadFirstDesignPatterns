package me.dylanroberts.headfirstdesignpatterns.duck;

public abstract class Duck {

    //declared as the interface types
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /*the duck class doesn't care HOW these fly and
    quack methods are implemented, it just cares that
    they are implemented (interface forces this)*/
    public void performFly() { flyBehavior.fly(); }
    public void performQuack() { quackBehavior.quack(); }

    public abstract void display();

    public void swim() {
        System.out.println("swim swim swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}