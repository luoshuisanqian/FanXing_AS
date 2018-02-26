package com.day1108.fanxing180208;

/**
 * Created by hming on 2018/2/8.
 */

public class Gin6<T> implements GenInter6<T> {
    private  String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Gin6(String info) {
        this.info = info;
    }

    @Override
    public void say() {

    }
}
