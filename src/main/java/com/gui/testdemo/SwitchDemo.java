package com.gui.testdemo;

/**
 * Created by guijianliang on 2019-02-21.
 * switch 语句中的变量类型可以是： byte、short、int 或者 char。
 * 从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
 */


public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
        }
    }
}
