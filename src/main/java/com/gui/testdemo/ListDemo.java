package com.gui.testdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by guijianliang on 2019-02-21.
 */

/**
 * stream()
 */

public class ListDemo {
    public static void main(String[] args) {
//        List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        System.out.println(costBeforeTax.getClass().getName());

        Random random = new Random();
//        random.ints().limit(20).forEach(System.out::println);
        IntStream.range(0,5).forEach(System.out::println);
    }
}
