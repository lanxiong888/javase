package com.at.generic.method;

public class SubOrder5<T,E> extends Order<T>{
   E e;


    public SubOrder5() {
    }

    public SubOrder5(E e) {
        this.e = e;
    }

    /**
     * 获取
     * @return e
     */
    public E getE() {
        return e;
    }

    /**
     * 设置
     * @param e
     */
    public void setE(E e) {
        this.e = e;
    }

    public String toString() {
        return "SubOrder5{e = " + e + "}";
    }
}
