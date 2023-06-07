package com.MyTest;

public class tte {

    int i=0;
    public static void test(){
        int n=5;
        for (int j = 0; j < 5; j++) {
            try {
                int m=n/j++;
                System.out.println(m);
            }catch (Exception e){
                System.out.print(e.getMessage());
            }finally {
                System.out.print("---");
            }
        }

    }

    public static void main(String[] args) {
        tte.test();
    }
}
