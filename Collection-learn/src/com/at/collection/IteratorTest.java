package com.at.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(new String("CC"));
        Iterator iterator = coll.iterator();
//        System.out.println(iterator.getClass());
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        System.out.println(coll);
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(coll);

    }
}
