package com.MyTest;

public class Bclass {

    AClass aClass=new AClass();
    public void show(){

        aClass.show2();
        aClass.show3();
        aClass.show4();

        System.out.println(aClass.c);
        System.out.println(aClass.b);
        System.out.println(aClass.d);
    }

    public static void main(String[] args) {
        Bclass bclass= new Bclass();
        bclass.show();
    }

}
