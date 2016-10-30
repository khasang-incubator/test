package io.khasang.strategy;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
