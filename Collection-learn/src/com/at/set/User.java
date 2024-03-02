package com.at.set;

import java.util.Objects;

public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (this == o) return 0;
//        if(o instanceof  User){
//            User u = (User)o;
//            return this.age - u.age;
//        }
//        throw new RuntimeException("类型不匹配");
//    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if(o instanceof  User){
            User u = (User)o;
            int value = this.age - u.age;
            if(value!=0) return value;

            return this.name.compareTo(u.name);
        }
        throw new RuntimeException("类型不匹配");
    }



}
