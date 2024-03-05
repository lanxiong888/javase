package com.at.generic.extend;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;
        Object[] arr = null;
        String[] arr1 = null;
        arr = arr1;
    }
    @Test
    public void test2(){
        ArrayList<Object> list1 = null;
        ArrayList<String> list2 = null;
//        list1 = list2;
    }
    @Test
    public void test3(){
        List<String> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();
        list1 = list2;

    }

    public void method(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void test4(){
        List<?> list = null;
        List<Object> list1 = new ArrayList<>();
        list1.add("123");
        List<String> list2 = new ArrayList<>();
        list2.add("123");
        list = list1;
        Object o = list.get(0);
        list = list2;
        Object o1 = list.get(0);
        list.add(null);
    }

    @Test
    public void test5(){
//        List<? extends Father> list = null;
        List<? super Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
//        list = list3;
    }

    @Test
    public void test6(){
        List<? extends Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());
        list = list1;

        Father father = list.get(0);
        list.add(null);

    }
    @Test
    public void test7(){
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());
        list = list1;

        Object object = list.get(0);
        list.add(null);
        list.add((new Father()));
        list.add(new Son());

    }
}
