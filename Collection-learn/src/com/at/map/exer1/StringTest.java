package com.at.map.exer1;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        String singer1 = "周杰伦";
        ArrayList songs1 = new ArrayList();
        songs1.add("夜曲");
        songs1.add("七里香");
        songs1.add("发如雪");
        hashMap.put(singer1, songs1);
        System.out.println(hashMap);

        String singer2 = "林俊杰";
        ArrayList songs2 = new ArrayList();
        songs2.add("江南");
        songs2.add("曹操");
        hashMap.put(singer2, songs2);
        System.out.println(hashMap);
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println("歌手:"+next.getKey());
            System.out.println("歌曲:"+next.getValue());
        }


    }
}
