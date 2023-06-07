package com.MyTest;

public class AClass {

    private int a=1;
    protected  int b=2;
    public  int c=3;
    int d=4;
    Integer s=Integer.MAX_VALUE;


    private void show1(){
        System.out.println(a);
    }

    protected void show2(){
        System.out.println(b);
    }

    public void  show3(){
        System.out.println(c);
    }

    void show4(){
        System.out.println(d);
    }
    public static void main(String[] args) {
        AClass aClass=new AClass();
        System.out.println(aClass.s);
    }
}
