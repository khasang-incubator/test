package io.khasang.strategy;

public class ToyDuck extends Duck{
    public ToyDuck() {
        quackBehavior = new QuackNo();
        flyBehavior = new FlyNoWay();
    }

    void display() {
        System.out.println("A toy duck.");
    }
}
