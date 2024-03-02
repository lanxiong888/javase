package com.at.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("AA");
        treeSet.add("bb");
        treeSet.add("JJ");
        treeSet.add("BB");
        treeSet.add("CC");
        treeSet.add("ooo");

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new User("tom",18));
        treeSet1.add(new User("jerry",28));
        treeSet1.add(new User("jack",38));
        treeSet1.add(new User("tony",38));
        treeSet1.add(new User("rose",58));
        iterator=treeSet1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------");

        Comparator comparator = (o1, o2)->{
            if(o1 instanceof User && o2 instanceof User){
                User u1 = (User)o1;
                User u2 = (User)o2;
                int value = u1.getName().compareTo(u2.getName());
                if(value != 0){
                    return value;
                }
                return -(u1.getAge()-u2.getAge());
            }
            throw new RuntimeException("类型不匹配");
        };
        iterator=treeSet1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
