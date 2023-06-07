package com.Proxy.Cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DebugMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("before method " + method.getName());
        Object o1 = methodProxy.invokeSuper(o, args);
        System.out.println("after method " + method.getName());
        return 01;
    }
}
