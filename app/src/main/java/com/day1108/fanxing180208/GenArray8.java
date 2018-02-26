package com.day1108.fanxing180208;

/**
 * Created by hming on 2018/2/8.
 */

/**
 * 泛型数组
 */
public class GenArray8 {

    public <T> void tell(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            LogCat.i("泛型数组========" + arr[i]);
        }
    }
}
