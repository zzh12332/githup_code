package com.test;

public class Demo {
    public static void main(String[] args) {
        System.out.println("输出结果"+new Demo().method());
    }
    public int method(){
        int i=1;
        try {
            int j=1/0;
            return ++i;
        }
        catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return 0;
        }
        finally {
            System.out.println("finally");
            ++i;
            return i;
        }

    }

}
