package com.Proxy.JdkProxy;

public class SmsServiceImpl implements SentMessage{
    @Override
    public String sent(String message) {
        System.out.println(message);
        return message;
    }
}
