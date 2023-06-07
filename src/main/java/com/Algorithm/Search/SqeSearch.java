package com.Algorithm.Search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SqeSearch {
    public static void main(String[] args) {
        int array[] = {1, 5, 12, 34, 34, 34, 101};
        List<Integer> list = seqSearch(array, 34);
        System.out.println(list);
    }
    public static List<Integer> seqSearch(int array[], int value) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        return list;
    }
}
