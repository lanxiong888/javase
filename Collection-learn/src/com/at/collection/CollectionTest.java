package com.at.collection;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void test() {
        ArrayList coll = new ArrayList();
        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Object());
        coll.add(new Person("john", 18));
        System.out.println(coll);

        System.out.println("----------------");
        ArrayList coll1 = new ArrayList();
        //addAll(Collection other)
        coll1.add("AA");
        coll1.add(123);
        coll1.addAll(coll);

        System.out.println(coll1);
        //size();
        System.out.println(coll1.size());

        coll.add(coll1);
        System.out.println(coll.size());
        System.out.println("----------------");

        /*
（4）boolean isEmpty()：判断当前集合是否为空集合
（5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
（6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
（7）boolean equals(Object obj)：判断当前集合与obj是否相等
         */

        ArrayList coll2 = new ArrayList();
        //add()
        coll2.add(new String("AA"));
        coll2.add(128);
        coll2.add(new Object());
        coll2.add(new Person("john", 18));
        System.out.println(coll2.isEmpty());
        System.out.println(coll2.contains(new String("AA")));//true
        System.out.println(coll2.contains(128));//true
        System.out.println(coll2.contains(new Person("john",18)));

    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("AA");
        coll.add(124);
        coll.add(new String("sgg"));

//        coll.clear();
//        System.out.println(coll);
//        System.out.println(coll.size());
        Collection coll1 = new ArrayList();
        coll1.add("AA");
        coll1.add("AA");
        coll.remove("AA");
        coll.remove(new String("sgg"));
//        coll.removeAll(coll1);
        coll.retainAll(coll1);
        System.out.println(coll);
    }

    /**
     * （12）Object[] toArray()：返回包含当前集合中所有元素的数组
     * （13）hashCode()：获取集合对象的哈希值
     * （14）iterator()：返回迭代器对象，用于集合遍历
     */
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("AA");
        coll.add(124);
        coll.add(new String("sgg"));
        //集合-->数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(coll.hashCode());
        Iterator iterator = coll.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test4(){
        String[] arr =new String[]{"AA","BB","CC"};
        Collection list1 = Arrays.asList(arr);
        Collection list2 = Arrays.asList("AA","BB","CC");
        System.out.println(list1);
        System.out.println(list2);
    }

    @Test
    public void test5(){
        Integer[] arr = {1, 2, 3};
        List list = Arrays.asList(arr);
        System.out.println(list.size());

        int[] arr1 = new int[]{1, 2, 3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());
    }
}
