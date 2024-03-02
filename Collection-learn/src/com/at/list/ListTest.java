package com.at.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add("AA");
        list.add(123);
        list.add("BB");

        System.out.println(list.toString());

//        add(Object obj)
//        addAll(Collection coll)
        list.add(2,"CC");
        System.out.println(list);
        List list1 = Arrays.asList(1, 2, 3);
//        list.addAll(list1);
        list.add(list1);
        System.out.println(list);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add(2);
        list.add("BB");
        System.out.println(list);
        //删除索引2
        list.remove(2);

        System.out.println(list);
        System.out.println(list.get(1));
        //删除数据2
        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }
}
