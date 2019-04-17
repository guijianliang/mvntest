package com.gui.duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by guijianliang on 2019-04-16.
 * 使用Future Future是一个接口,FuturaTask实现了Futured的接口;
 */


public class FutureDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        Callable baozi = new Callable() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "包子准备完毕";
            }
        };

        FutureTask f1 = new FutureTask(baozi);
        new Thread(f1).start();

        Callable liangcai = new Callable() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "凉菜准备完毕";
            }
        };

        FutureTask f2 = new FutureTask(liangcai);
        new Thread(f2).start();

        System.out.println(f1.get());
        System.out.println(f2.get());

        // get（）方法可以当任务结束后返回一个结果，如果调用时，工作还没有结束，则会阻塞线程，直到任务执行完毕
        // get 主要是等待返回的结果,如果没有get则主线程会继续往下执行;但是那个子线程还是不会中断的
        // get 主要是拿结果的

        long end = System.currentTimeMillis();
        System.out.println("结束了: " + String.valueOf(end - start));
    }
}

