package com.gui.duoxiancheng;

/**
 * Created by guijianliang on 2019-02-19.
 * 多线程实现runable接口
 * 用synchronized使线程安全
 */


public class ThreadDemo {

    public static void main(String[] args) {
        Count count = new Count();
        Thread t1 = new Thread(count);
        Thread t2 = new Thread(count);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count.getCounter());
    }
}

class Count implements Runnable {
    public static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                counter++;
            }
        }
    }
}






