package com.test;

import java.util.*;

public class Demo_Two {

    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(null);

        HashMap<String,Integer> hashMap=new HashMap();
        hashMap.put("1",1);
        hashMap.put("2",1);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        if (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println("key:"+key);
            System.out.println("value:"+value);
        }

        ArrayList<Integer> list=new ArrayList<>();
        List<Integer> list1 = Collections.synchronizedList(list);
    }
}
