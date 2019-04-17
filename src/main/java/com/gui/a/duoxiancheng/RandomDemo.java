package com.gui.a.duoxiancheng;

import java.util.Random;

/**
 * Created by guijianliang on 2019-04-12.
 */


public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
//        System.out.println(r.next(10));
        System.out.println(r.nextBoolean()); //返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的boolean值。
        System.out.println(r.nextInt(100));//返回一个伪随机数，它是取自此随机数生成器序列的、在（包括和指定值（不包括）之间均匀分布的int值。
        System.out.println(r.nextLong());//


    }
}
