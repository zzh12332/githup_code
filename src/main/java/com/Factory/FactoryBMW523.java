package com.Factory;

public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
