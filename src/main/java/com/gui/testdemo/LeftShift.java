package com.gui.testdemo;

/**
 * Created by guijianliang on 2019-02-26.
 * 测试下左移
 */


public class LeftShift {
    public static void main(String[] args) {
        int i = 2;
        int j;
        j = 3<<3; //24 --> 3*2^3 (好像都是2的幂?)
        System.out.println(j);
    }
}
