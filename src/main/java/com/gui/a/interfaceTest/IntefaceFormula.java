package com.gui.a.interfaceTest;

/**
 * Created by guijianliang on 2019-04-11.
 */


public class IntefaceFormula {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return a*100;
            }
        };
        System.out.println(formula.sqrt(16));
    }
}
