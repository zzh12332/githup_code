package com.MyTest;

public  class  Singleton {

    private Singleton() {
    }

    private static final Singleton single=new Singleton();

    public static Singleton getInstance() {
        return single;
    }
}
