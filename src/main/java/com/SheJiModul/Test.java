package com.SheJiModul;

public class Test {

    public static void main(String[] args) {
        ConcreatCommand command=new ConcreatCommand();

        Invoker invoker=new Invoker(command);

        invoker.xiWan();
    }
}
