package com.Algorithm.Sorts;

import java.util.Arrays;

public class MergetSort {
    public static void main(String[] args) {
        int array[] = {8, 4, 5, 7, 1, 3, 6, 2};
        int temp[] = new int[array.length];
        mergeSort2(array, 0, array.length - 1, temp);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int array[], int left, int right, int temp[]) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);
            mergeSort(array, mid + 1, right, temp);
            merge(array, left, mid, right, temp);
        }
    }

    //being
    public static void merge(int arr[], int left, int mid, int right, int temp[]) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];
            i++;
            t++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }
        t = 0;
        int tempLeft = left;
        System.out.println("tempLeft=" + tempLeft + "right=" + right);
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }

    public static void mergeSort2(int[] array, int left, int right, int temp[]) {
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort2(array, left, mid, temp);
            mergeSort2(array, mid + 1, right, temp);
            merge2(array, left, mid, right, temp);
        }
    }

    public static void merge2(int[] array, int left, int mid, int right, int[] temp) {
        int l = left;
        int j = mid + 1;
        int t = 0;
        while (l <= mid && j <= right) {
            if (array[l] <= array[j]) {
                temp[t] = array[l];
                t++;
                l++;
            } else {
                temp[t] = array[j];
                t++;
                j++;
            }
        }
        while (l <= mid) {
            temp[t] = array[l];
            t++;
            l++;
        }
        while (j <= right) {
            temp[t] = array[j];
            j++;
            t++;
        }
        int tempLeft = left;
        t = 0;
        while (tempLeft <= right) {
            array[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }
    }
}
