package com.at.collections;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {
    @Test
    public void test(){
        List list = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String&&o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return s2.compareTo(s1);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String&&o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return s2.compareTo(s1);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(max);
        int a = Collections.frequency(list, "a");
        System.out.println(a);
        List<String> list1 = Arrays.asList(new String[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list1);

        List list2 = Collections.unmodifiableList(list);
        System.out.println(list2);
//        list2.add("a");
//        System.out.println(list2);
        List list3 = Collections.synchronizedList(list);
        System.out.println(list3);

    }
}
