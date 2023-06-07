package com.Algorithm.Sorts;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 23, -2, 54, -1, 26, 79, 20};
//        quickSort(array, 0, array.length - 1);
        quickSort3(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int temp;
        int pivot = array[(left + right) / 2];
        while (l < r) {
            while (array[l] < pivot) {
                l++;
            }
            while (array[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            if (array[l] == pivot) {
                r--;
            }
            if (array[r] == pivot) {
                l++;
            }
        }
        if (l == r) {
            l++;
            r--;
        }
        if (left < r) {
            quickSort(array, left, r);
        }
        if (l < right) {
            quickSort(array, l, right);
        }
    }

    public static void quickSort2(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int temp;
        int quickValue = array[(left + right) / 2];
        while (l < r) {
            while (array[l] < quickValue) {
                l++;
            }
            while (array[r] > quickValue) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            if (array[l] == quickValue) {
                r--;
            }
            if (array[r] == quickValue) {
                l++;
            }
        }
        if (l == r) {
            r--;
            l++;
        }
        if (left < r) {
            quickSort2(array, left, r);
        }
        if (l < right) {
            quickSort2(array, l, right);
        }


    }

    public static void quickSort3(int[] array,int left, int right){
        int l=left;
        int r=right;
        int temp;
        int midValue=array[(left+right)/2];
        while (l<r){
            while (array[l]<midValue){
                l++;
            }
            while (array[r]>midValue){
                r--;
            }
            if (l >= r) {
                break;
            }
            temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            if (array[l]==midValue){
                r--;
            }
            if (array[r]==midValue){
                l++;
            }
        }
        if (l==r){
            l++;
            r--;
        }
        if (l<right){
            quickSort3(array,l,right);
        }
        if (left<r){
            quickSort3(array,left,r);
        }
    }

}


