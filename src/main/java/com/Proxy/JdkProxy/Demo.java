package com.Proxy.JdkProxy;

public class Demo {

    public static void main(String[] args) {
        SentMessage proxy = (SentMessage) JdkProxyFactory.getProxy(new SmsServiceImpl());
        String sent = proxy.sent("你好,恭喜您面试通过");
    }
}
