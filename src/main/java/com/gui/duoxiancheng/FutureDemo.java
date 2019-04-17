package com.gui.duoxiancheng;

/**
 * Created by guijianliang on 2019-04-16.
 * 未采用多线程
 */


public class FutureDemo {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Baozi baozi = new Baozi();
        baozi.start();
        baozi.join();

        Liangcai liangcai = new Liangcai();
        liangcai.start();
        liangcai.join();

        long end = System.currentTimeMillis();
        System.out.println("结束了: "+String.valueOf(end-start)); //结束了: 4007 差不多4s


    }
}

class Baozi extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("包子准备完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Liangcai extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("凉菜准备完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}



