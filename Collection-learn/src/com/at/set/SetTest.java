package com.at.set;

import com.at.collection.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("AA");
        set.add(123);
        set.add(new Person("zs", 18));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------------");
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println(set.contains(new Person("zs", 18)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("AA");
        linkedHashSet.add(123);
        linkedHashSet.add(new Person("zs", 18));
        for (Object o : linkedHashSet) {
            System.out.println(o);
        }


    }
}
