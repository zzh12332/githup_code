package com.Algorithm.Search;

public class BinarySearch {

    public static void main(String[] args) {
        int array[] = {1, 5, 12, 34, 101, 102, 103};
//        int i = binarySearch(array, 0, array.length - 1, 2);
        int i2 = binarySearch2(array, 0, array.length - 1, 12);
        System.out.println(i2);
    }

    public static int binarySearch(int array[], int left, int right, int findValue) {
        int midIndex = (left + right) / 2;
//        midIndex = left + (right - left) * (findValue - array[left]) / (array[right] - array[left]);
        int midValue = array[midIndex];
        System.out.println("--");
        if (left > right) {
            return -1;
        }
        if (findValue > midValue) {
            return binarySearch(array, midIndex + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearch(array, left, midIndex - 1, findValue);
        } else {
            return midIndex;
        }
    }

    public static int binarySearch2(int array[], int left, int right, int findValue) {
        int midIndex = (left + right) / 2;
        int midValue = array[midIndex];
        if (left > right) {
            return -1;
        }
        if (findValue > midValue) {
            return binarySearch2(array, midIndex + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearch2(array, left, midIndex - 1, findValue);
        } else {
            return midIndex;
        }
    }
}
