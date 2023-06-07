package com.MyTest;

public class Singleton_lazy {

    private Singleton_lazy() {};

    private static class SingletonInstance {
        private static final Singleton_lazy SINGLETON_LAZY=new Singleton_lazy();
    }
    public static Singleton_lazy getInstance(){
        return SingletonInstance.SINGLETON_LAZY;
    }
}
