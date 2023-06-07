package com.ThreadPoolTest;

import java.util.Vector;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(1000),
                new NamedThreadFactory("UserModule"),
                new ThreadPoolExecutor.AbortPolicy()
        );
        for (int i = 1; i <=30 ; i++) {
            MyTask myTask=new MyTask("客户"+i);
            Future<?> submit = pool.submit(myTask);
        }
        pool.shutdown();
    }

}
