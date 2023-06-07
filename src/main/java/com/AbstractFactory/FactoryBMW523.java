package com.AbstractFactory;

public class FactoryBMW523 implements AbstractFactory{
    @Override
    public Engine createEngin() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
