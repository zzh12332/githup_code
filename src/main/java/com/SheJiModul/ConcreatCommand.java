package com.SheJiModul;

public class ConcreatCommand implements Command{

    private static Receiver receiver=new Receiver();

    @Override
    public void xiWan() {
        receiver.xiWan();
    }

    @Override
    public void zuoFan() {
        receiver.zuoFan();
    }

}
