package com.at.generic.method;

import org.junit.Test;

import java.util.*;

public class GenericTest {
    @Test
    public void  test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            int score = i;
            System.out.println(score);
        }
    }

    @Test
    public void  test2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(234);
        list.add(345);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            int score = i;
            System.out.println(score);
        }
    }

    @Test
    public void test3(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        var entries = map.entrySet();
        var iterator = entries.iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void test4(){
        Order order = new Order();
        SubOrder1 subOrder1 = new SubOrder1();
        SubOrder2 subOrder2 = new SubOrder2();
        SubOrder3<Integer> integerSubOrder3 = new SubOrder3<>();
        integerSubOrder3.show(123);
        SubOrder5<String, Integer> sub5 = new SubOrder5<>();
        String t = sub5.getT();
        Integer e = sub5.getE();

    }
    @Test
    public void test5(){
        Order<String> order1 = new Order<>();
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> integers = order1.copyFromArrayToList(arr);
        for(Integer i : integers){
            System.out.println(i);
        }

    }
}
