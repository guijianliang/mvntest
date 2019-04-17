package com.gui.demo1.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by guijianliang on 2019-03-25.
 * stream 是java8中处理集合的关键抽象概念
 * +--------------------+       +------+   +------+   +---+   +-------+
 * | stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
 * +--------------------+       +------+   +------+   +---+   +-------+
 */


public class StreamDemo {
    public static void main(String[] args) {
        /**
         * stream() − 为集合创建串行流。
         * 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等;
         * 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等
         */
        /**
        //这里是 stream()

        List<String> strings = Arrays.asList("abc", "", "bc", "heheheh", "heheh", "", "hheheh999");
        System.out.println(strings);
        List<String> filter = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filter);
        */

        /**
         * 下面是forEach 来迭代流中的每个数据
         * limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
         */
        /*
        Random random = new Random();
//        System.out.println(random.nextInt(200));
        random.ints().limit(5).forEach(System.out::println);
        */

        /**
         * map 方法
         */
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        List<Integer>num2 = number.stream().map((i)->i*i).collect(Collectors.toList());

        System.out.println(num2);


    }
}
