package com.gui.a.interfaceTest;

/**
 * Created by guijianliang on 2019-04-11.
 */


public interface Formula {
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
