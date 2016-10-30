package io.khasang.strategy;

public class Main {
    public static void main(String[] args) {
        DuckWithGreyHead duck = new DuckWithGreyHead();
        ToyDuck toyDuck = new ToyDuck();
        duck.performQuack();
        duck.performFly();
        toyDuck.display();
    }

    void test(){

    }
}
