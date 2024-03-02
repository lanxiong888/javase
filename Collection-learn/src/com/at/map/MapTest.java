package com.at.map;

import com.at.collection.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
        map.put(null, null);
        ;
        map.put(new Person("jerry", 123), 56);
        System.out.println(map.size());
        Object aa = map.remove("AA");
        System.out.println(aa);
        Object bb = map.put("BB", 99);
        System.out.println(bb);
        Object aa1 = map.get("CC");
        System.out.println(aa1);
        System.out.println(map);
        //遍历
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("--------------------------");
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("-------------------");

        for (Object o : set) {
            System.out.println(map.get(o));
        }
        System.out.println("--------------------------");
        Set set1 = map.entrySet();
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            Map.Entry next = (Map.Entry) iterator2.next();
            System.out.println(next.getKey() + ":" + next.getValue());
//            System.out.println(iterator2.next());
        }
        for (Object o : set1) {
            System.out.println(o);
        }
    }

    @Test
    public void test2() {
        Map map = new Hashtable();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
//        map.put(null,null);;
        System.out.println(map);

    }

    @Test
    public void test3() {
        Map map = new LinkedHashMap();
        map.put("AA", 123);
        map.put("BB", 456);
        map.put("CC", 789);
        map.put(null, null);
        ;
        System.out.println(map);
    }

    @Test
    public void test4() {
        Map map = new TreeMap();
        map.put("AA", 123);
        map.put("CC", 789);
        map.put("BB", 456);
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        map.put(null,null);
        System.out.println(map);
    }

    @Test
    public void test5() {
        TreeMap map = new TreeMap();
        User u1 = new User("tom", 23);
        User u3 = new User("rose", 43);
        User u2 = new User("Jerry", 33);
        User u5 = new User("tony", 63);
        User u4 = new User("jack", 53);

        map.put(u1, 1);
        map.put(u2, 2);
        map.put(u3,3);
        map.put(u4,4);
        map.put(u5,5);
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println(map.containsKey(new User("gku", 23)));
    }

    @Test
    public void test6() {
        Comparator comparator =(o1,o2)->{
            if(o1 instanceof User && o2 instanceof User){
                User u1 = (User)o1;
                User u2 = (User)o2;
                int value = u1.getName().compareTo(u2.getName());
                if(value!= 0){
                    return value;
                }
                return u1.getAge() - u2.getAge();

            }
            throw new RuntimeException("类型不匹配");
        };

        TreeMap map = new TreeMap(comparator);
        User u1 = new User("tom", 23);
        User u3 = new User("rose", 43);
        User u2 = new User("Jerry", 33);
        User u5 = new User("tony", 63);
        User u4 = new User("jack", 53);

        map.put(u1, 1);
        map.put(u2, 2);
        map.put(u3,3);
        map.put(u4,4);
        map.put(u5,5);
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println(map.containsKey(new User("Jerry", 33)));
    }
    @Test
    public void test7() throws IOException {
        File file = new File("info.properties");
        System.out.println(file.getAbsoluteFile());
        FileInputStream fis = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(fis);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println("name: " + name+" password: " + password);


    }
}
