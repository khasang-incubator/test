package io.khasang.strategy;

public class DuckWithGreyHead extends Duck {
    public DuckWithGreyHead() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    void display() {
        System.out.println("uniq duck");
    }

}
