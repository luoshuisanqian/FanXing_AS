package com.day1108.fanxing180208;

/**
 * Created by hming on 2018/2/8.
 */

/**
 * 通配符的使用
 */
public class Info5<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return this.getKey().toString();
    }
}
