package com.at.generic.method;

import java.util.ArrayList;

public class Order<T> {
    T t;
    int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    /**
     * 获取
     *
     * @return t
     */
    public T getT() {
        return t;
    }

    /**
     * 设置
     *
     * @param t
     */
    public void setT(T t) {
        this.t = t;
    }

    /**
     * 获取
     *
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * 设置
     *
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String toString() {
        return "Order{t = " + t + ", orderId = " + orderId + "}";
    }

    public <E> E method(E e) {
        return null;
    }

    public static  <E> ArrayList<E> copyFromArrayToList(E[] array) {
        ArrayList<E> list = new ArrayList<>();
        for (E e : array) {
            list.add(e);
        }
        return list;
    }
}
