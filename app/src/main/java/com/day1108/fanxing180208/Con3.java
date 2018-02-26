package com.day1108.fanxing180208;

/**
 * Created by hming on 2018/2/8.
 */

public class Con3<T> {
    private T value;

    /**
     * 在构造方法中指定泛型，
     */
    public Con3(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
