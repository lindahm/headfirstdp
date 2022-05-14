package com.app.headfirst;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
