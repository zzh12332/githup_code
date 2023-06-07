package com.AbstractFactory;

public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine createEngin() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
