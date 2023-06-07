package com.ThreadPoolTest;

public class MyTask implements Runnable{

    private String username;
    private static int id=10;

    public MyTask(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(username+"正在使用"+name+"线程,成功秒杀华为P30!!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (MyTask.class){
            if (id>0){
                System.out.println(username+"使用"+name+"线程,成功秒杀华为P30!!");
                id--;
                if (id>0){
                    System.out.println("商品还剩下"+id+"个");
                }else {
                    System.out.println("商品已售完");
                }
            }else {
                System.out.println(username+"秒杀失败啦!");
            }

        }
    }

}
