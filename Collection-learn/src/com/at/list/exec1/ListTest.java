package com.at.list.exec1;

import java.util.ArrayList;
import java.util.Collection;

public class ListTest {
    /*
    案例：
    定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
    (1) 创建集合，集合存放随机生成的30个小写字母
    (2) 用listTest统计，a、b、c、x元素的出现次数
    (3) 效果如下
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)((Math.random() * (122 - 97 + 1)) + 97)+"");
        }
        System.out.println(list);

        int i = listTest(list, "a");
        int j = listTest(list, "b");
        int k = listTest(list, "c");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }


    public static int listTest(Collection list, String s){
        int count = 0;
        for (Object obj : list) {
            if (obj.equals(s)){
                count++;
            }
        }
        return count;
    }
}
