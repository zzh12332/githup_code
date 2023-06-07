package com.SheJiModul;

public class Invoker {

    private Command command;

    // 构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    // 设值注入

    // 业务方法，用于调用命令类中的execute()方法
    public void xiWan() {
        command.xiWan();
    }
}
