package com.gui.a.invokedemo;

/**
 * Created by guijianliang on 2019-04-17.
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public String name;
    public Integer age;
    public Integer score;

    public String driving(String s) {
        System.out.println("打印喝水 : " + s);
        return "喝水: " + s;
    }

    public static String run(String s) {
        return s;
    }

    public void eat() {
        System.out.println("打印he is eat.");
    }

}
