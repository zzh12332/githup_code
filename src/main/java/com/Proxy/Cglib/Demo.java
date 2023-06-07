package com.Proxy.Cglib;

public class Demo {

    public static void main(String[] args) {
        AliSmsService proxy = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        String aaa = proxy.send("aaa");
        
    }
}
