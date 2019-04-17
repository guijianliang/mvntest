package com.gui.a.duoxiancheng;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * Created by guijianliang on 2019-04-12.
 * 为了验证volatile的可见性
 */


public class VolatileDemo {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        t1.start();
        t2.start();
    }


}

class Thread3 extends Thread {
    //    private int ticket = 0;  //结果值是1936
    private volatile int ticket = 0; //这里的volatile不起作用???
    /**
     * volatile: 只是当一个线程更改值的时候会立刻刷新的主内存中,但是对于已经读取的线程不起作用
     */
    String str = new String();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (str) {
            ticket++;
//            }
            System.out.println(ticket);
        }
    }
}
