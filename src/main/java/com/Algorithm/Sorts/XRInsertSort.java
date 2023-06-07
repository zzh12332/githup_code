package com.Algorithm.Sorts;

import java.util.Arrays;

public class XRInsertSort {
    public static void main(String[] args) {
        int[] array = {1, 54, 12, 2, -1, 26};
//        xRInsertSort(array);
        xRInsertSort3(array);
        System.out.println(Arrays.toString(array));
    }

    public static void xRInsertSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int insertIndex = i;
                int insertValue = array[i];
                while (insertIndex - gap >= 0 && insertValue < array[insertIndex - gap]) {
                    array[insertIndex] = array[insertIndex - gap];
                    insertIndex -= gap;
                }
                array[insertIndex] = insertValue;
            }
        }
    }

    public static void xRInsertSort2(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int insertValue = array[i];
                int insetIndex = i;
                while (insetIndex - gap >= 0 && insertValue < array[insetIndex - gap]) {
                    array[insetIndex] = array[insetIndex - gap];
                    insetIndex -= gap;
                }
                array[insetIndex] = insertValue;
            }
        }
    }
    public static void xRInsertSort3(int[] array){
        for (int gap = array.length/2; gap > 0; gap/=2) {
            for (int i = gap; i < array.length; i++) {
                int insertValue=array[i];
                int insertIndex=i;
                while (insertIndex-gap>=0 && insertValue<array[insertIndex-gap]){
                    array[insertIndex]=array[insertIndex-gap];
                    insertIndex-=gap;
                }
                array[insertIndex]=insertValue;

            }
        }
    }
}



