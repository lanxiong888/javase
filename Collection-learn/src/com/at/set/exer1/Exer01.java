package com.at.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 案例：
 定义方法如下：public static List duplicateList(List list)
 要求：① 参数List中只存放Integer的对象
 ② 在List内去除重复数字值，尽量简单


 */
public class Exer01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(31);
        list1.add(32);
        list1.add(32);
        list1.add(32);
        list1.add(33);
        list1.add(33);
        list1.add(33);
        list1.add(34);
        list1.add(34);
        list1.add(34);
        list1.add(35);
        List list = duplicateList(list1);
        System.out.println(list);
    }

    public static List duplicateList(List list){
        /*HashSet hashSet = new HashSet();
        for (Object o : list){
            hashSet.add(o);
        }
        ArrayList list1 = new ArrayList();
        for (Object o:hashSet){
            list1.add(o);
        }
        return list1;*/

        HashSet hashSet = new HashSet(list);
        ArrayList list1 = new ArrayList(hashSet);
        return list1;
    }

}
