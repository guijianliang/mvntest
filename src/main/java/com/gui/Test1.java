package com.gui;

import java.util.concurrent.*;

/**
 * Created by guijianliang on 2019-02-20.
 * 看下时间戳
 */


public class Test1 {
    public static void main(String[] args) {
        String s = getRandomCode(6);
        System.out.println(s);

//        ExecutorService executorService= Executors.newSingleThreadExecutor();
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//
//        Future<Test1> future=executorService.submit(new Callable<Test1>() {
//
//            @Override
//            public Test1 call() throws Exception {
//                return null;
//            }
//        });
//
//       Test1 test1= future.get(3,TimeUnit.SECONDS);

    }

    public static String getRandomCode(int n) {
        String a = "0123456789qwertyuiopasdfghjklzxcvbnmABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] rands = new char[n];
        for (int i = 0; i < rands.length; i++) {
            System.out.println((Math.random()));
            int rand = (int) (Math.random() * a.length());
            rands[i] = a.charAt(rand);
        }
        return String.valueOf(rands);
    }

}
