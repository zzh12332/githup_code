package com.test;

public class MyTest {
    public static void main(String[] args) {
        MyObject obj=new MyObject();
        AThread th1=new AThread(obj);
        BThread th2=new BThread(obj);
        CThread th3=new CThread(obj);
        th1.start();
        th2.start();
        th3.start();
    }
}
class MyObject {
    int flag = 1;
}

class AThread extends Thread{
    private MyObject object;

    public AThread( MyObject object) {
        this.object = object;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (object){
                while (object.flag!=1){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                object.flag=2;
                object.notifyAll();
            }
        }
    }
}

class BThread extends Thread{
    private MyObject object;

    public BThread( MyObject object) {
        this.object = object;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (object){
                while (object.flag!=2){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                object.flag=3;
                object.notifyAll();
            }
        }
    }
}

class CThread extends Thread{
    private MyObject object;

    public CThread( MyObject object) {
        this.object = object;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (object){
                while (object.flag!=3){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                object.flag=1;
                object.notifyAll();
            }
        }
    }
}
