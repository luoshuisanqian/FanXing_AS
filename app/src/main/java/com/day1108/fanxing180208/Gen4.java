package com.day1108.fanxing180208;

/**
 * Created by hming on 2018/2/8.
 */

/**
 * 指定多个泛型
 */
public class Gen4<K,T> {
    private T take;
    private K key;

    public T getTake() {
        return take;
    }

    public void setTake(T take) {
        this.take = take;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
