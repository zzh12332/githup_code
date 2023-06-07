package com.MyTest;

public class SingletonDubbo {

    private static volatile  SingletonDubbo singletonDubbo;

    private SingletonDubbo() {};

    public static SingletonDubbo getInstance() {
        if (singletonDubbo==null) {
            synchronized (SingletonDubbo.class){
                if (singletonDubbo==null) {
                    singletonDubbo=new SingletonDubbo();
                }
            }
        }
        return singletonDubbo;
    }
}
