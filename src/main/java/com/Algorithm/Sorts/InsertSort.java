package com.Algorithm.Sorts;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1, 54, 12, 2, -1, 26};
//        insertSort(array);
//        insertSort2(array);
        insertSort4(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int insertIndex = i;//3
            while (insertIndex > 0 && insertValue < array[insertIndex - 1]) {
                array[insertIndex] = array[insertIndex - 1];
                insertIndex--;//aa
            }
            array[insertIndex] = insertValue;
        }
    }

    public static void insertSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int insertIndex = i;
            while (insertIndex > 0 && insertValue < array[insertIndex - 1]) {
                array[insertIndex] = array[insertIndex - 1];
                insertIndex--;
            }
            array[insertIndex] = insertValue;
        }
    }

    public static void insertSort3(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int insertIndex = i;
            while (insertIndex - 1 >= 0 && insertValue < array[insertIndex - 1]) {
                array[insertIndex] = array[insertIndex - 1];
                insertIndex--;
            }
            array[insertIndex] = insertValue;
//            int[] array = {1, 54, 12, 2, -1, 26};?
        }
    }
    public static void insertSort4(int[] array){
        for (int i = 1; i < array.length; i++) {
            int insertValue=array[i];
            int insertIndex=i;
            while (insertIndex-1 >= 0 && insertValue < array[insertIndex-1]){
                array[insertIndex]=array[insertIndex-1];
                insertIndex--;
            }
            array[insertIndex]=insertValue;
        }

    }
}



