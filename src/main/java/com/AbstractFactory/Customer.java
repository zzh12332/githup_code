package com.AbstractFactory;

public class Customer {

    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320=new FactoryBMW320();
        Engine enginA = factoryBMW320.createEngin();
        Aircondition airconditionA = factoryBMW320.createAircondition();

        FactoryBMW523 factoryBMW523=new FactoryBMW523();
        factoryBMW523.createAircondition();
        factoryBMW320.createEngin();
    }
}
