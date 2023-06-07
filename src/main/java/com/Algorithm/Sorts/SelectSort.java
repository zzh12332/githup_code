package com.Algorithm.Sorts;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = {1, 12, 2, -1, 26};
//        selectSort(array);
//        selectSort2(array);
          selectSort3(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                array[minindex] = array[i];
                array[i] = min;
            }
        }
    }

    public static void selectSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;

            }
        }
    }
//    int[] array = {1, 12, 2, -1, 26};

    public static void selectSort3(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minValue=array[i];
            int minIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<minValue){
                    minValue=array[j];
                    minIndex=j;
                }
            }
            if (i!=minIndex){
                array[minIndex]=array[i];
                array[i]=minValue;

            }
        }
    }
}
