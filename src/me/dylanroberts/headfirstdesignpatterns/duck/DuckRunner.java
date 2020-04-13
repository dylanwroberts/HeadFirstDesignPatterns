package me.dylanroberts.headfirstdesignpatterns.duck;

public class DuckRunner {
    public static void main(String[] args) {
        Duck wooden = new WoodenDuck();
        Duck mallard = new MallardDuck();

        wooden.performFly();
        wooden.performQuack();

        System.out.println("\n");

        mallard.performFly();
        mallard.performQuack();

        System.out.println("\n");

        //the wooden duck magically grows wings
        wooden.setFlyBehavior(new FlyWithWings());
        wooden.performFly();
    }
}
