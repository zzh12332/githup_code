package com.Algorithm.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch2 {

    public static void main(String[] args) {
        int array[] = {1, 5, 12, 34, 34, 34, 101};
//        List list = binarySearch(array, 0, array.length - 1, 34);
        List list = binarySearch2(array, 0, array.length - 1, 34);
        System.out.println(list);
    }

    public static List<Integer> binarySearch(int array[], int left, int right, int findValue) {
        int midIndex = (left + right) / 2;
        int midValue = array[midIndex];
        if (left > right) {
            return new ArrayList<>();
        }
        if (findValue > midValue) {
            return binarySearch(array, midIndex + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearch(array, left, midIndex - 1, findValue);
        } else {
            int temp = midIndex - 1;
            List<Integer> list = new ArrayList<>();
            while (true) {
                if (temp < 0 || array[temp] != findValue) {
                    break;
                }
                list.add(temp);
                temp--;
            }
            list.add(midIndex);

            temp = midIndex + 1;
            while (true) {
                if (temp > array.length - 1 || array[temp] != findValue) {
                    break;
                }
                list.add(temp);
                temp++;
            }
            return list;
        }
    }

    public static List<Integer> binarySearch2(int array[], int left, int right, int findValue) {
        int midIndex = (left + right) / 2;
        int midValue = array[midIndex];
        if (left > right) {
            return new ArrayList<>();
        }
        if (findValue > midValue) {
            return binarySearch(array, midIndex + 1, right, findValue);
        } else if (findValue < midValue) {
            return binarySearch(array, left, midIndex - 1, findValue);
        } else {
            List<Integer> list = new ArrayList<>();
            int temp = midIndex - 1;
            while (true) {
                if (temp < 0 || findValue != array[temp]) {
                    break;
                }
                list.add(temp);
                temp--;
            }
            list.add(midIndex);

            temp = midIndex + 1;
            while (true) {
                if (temp > array.length - 1 || findValue != array[temp]) {
                    break;
                }
                list.add(temp);
                temp++;
            }
            return list;
        }
    }
}
