package com.Algorithm.Sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 23, 54, 32, 12, 2, -1, 26};
//        bubbleSort(array);
//        bubbo2(array);
        bubbo3(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {//冒泡次数
            for (int j = 0; j < array.length - 1 - i; j++) {//冒泡步骤
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void bubbo2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void bubbo3(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }

    }
}
