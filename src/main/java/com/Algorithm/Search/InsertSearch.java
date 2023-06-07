package com.Algorithm.Search;

import java.util.Arrays;

public class InsertSearch {
    public static void main(String[] args) {
//        int array[]=new int[100];
//        for (int i = 0; i <100 ; i++) {
//            array[i]=i+1;
//        }
        int array[] = {1, 5, 12, 34, 101};

//        System.out.println(Arrays.toString(array));
        int index = insertSearch(array, 0, array.length - 1, 34);
        System.out.println(index);
    }

    public static int insertSearch(int array[], int left, int right, int findValue) {
        if (left > right || findValue < array[0] || findValue > array[array.length - 1]) {
            return -1;
        }
        System.out.println("----");
        int mid = left + (right - left) * (findValue - array[left]) / (array[right] - array[left]);
        int mid2 = left + (right - left) * (findValue - array[left]) / (array[right] - array[left]);
        int midValue = array[mid];
        if (findValue > midValue) {
            return insertSearch(array, mid + 1, right, findValue);
        } else if (findValue < midValue) {
            return insertSearch(array, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }

}
