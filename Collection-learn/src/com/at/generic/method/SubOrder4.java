package com.at.generic.method;

public class SubOrder4<E> extends Order<Integer>{
   E e;

    public SubOrder4() {
    }

    public SubOrder4(E e) {
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
        return "SubOrder4{e = " + e + "}";
    }
}
