package com.gui.testdemo;

/**
 * Created by guijianliang on 2019-02-22.
 * 单例
 */

/**
 * 单例1,最简单,线程不安全
 */
public class SingleTon {
    private static SingleTon instance;

    public SingleTon() {
    }

    //synchronized 加上后,就变成了线程安全的.
    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

}
