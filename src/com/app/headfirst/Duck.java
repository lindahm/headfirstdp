package com.app.headfirst;

import lombok.Getter;
import lombok.Setter;

public abstract class Duck {

    @Getter @Setter private FlyBehavior flyBehavior;
    @Getter @Setter private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float");
    }


}
