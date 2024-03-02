package com.at.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static <student> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学生信息");
        List list = new ArrayList();
        while(true){
            System.out.println("1：继续录入，0：结束录入");
            int selection = scanner.nextInt();
            if (selection==0){
                break;
            }
            System.out.println("请输入学生姓名");
            String name = scanner.next();
            System.out.println("请输入学生年龄");
            int age = scanner.nextInt();
            Student student = new Student(name, age);
            list.add(student);

        }

        for (Object s : list) {
            student s1 = (student) s;
            System.out.println(s1);
        }
        scanner.close();
    }
}
