package com.gui.a.duoxiancheng;

/**
 * Created by guijianliang on 2019-04-12.
 * private static int ticket = 100;放在共享内存中每一个new出来的对象都可以读取;
 */




public class ThreadStatic {
    public static void main(String[] args) {
        Thread4 thread4_1 = new Thread4();
        Thread4 thread4_2 = new Thread4();
        Thread4 thread4_3 = new Thread4();
        thread4_1.start();
        thread4_2.start();
        thread4_3.start();

    }


}

class Thread4 extends Thread {
//    private int ticket = 100;
    private static int ticket = 100; //这里的static是共享变量,对于上面的new出来的3个线程都是调用一个

    @Override
    public void run() {
        while (true) {
            sale();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (ticket<0){
                break;
            }
        }


    }

    synchronized void sale() {
        System.out.println("还有 " + ticket-- + "张票");
    }
}
