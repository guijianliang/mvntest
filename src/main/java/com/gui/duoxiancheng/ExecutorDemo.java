package com.gui.duoxiancheng;

/**
 * Created by guijianliang on 2019-02-21.
 * 这里是用executor实现的多线程.
 */


import java.time.Year;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * newSingleThreadExecutor ,
 * newSingleThreadExecutor创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，
 * 其实这就是个单线程,但是他是异步的,他不会阻塞主流程;
 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行;
 */


//public class ExecutorDemo {
//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//
//        IntStream.range(0, 5).forEach(i -> executor.execute(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("finished: " + threadName);
//        }));
//
//        try {
//            //close pool
//            executor.shutdown();
//            executor.awaitTermination(5, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            if (!executor.isTerminated()) {
//                executor.shutdownNow();
//            }
//        }
//    }
//}

/*

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        IntStream.range(0,5).forEach(i->executor.execute(()->{
            String threadName = Thread.currentThread().getName();
            System.out.println("finished " + threadName);
        }));

        try{
            executor.shutdown();
            executor.awaitTermination(5,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (!executor.isTerminated()){
                executor.shutdownNow();
            }
        }

    }
}

*/

/**
 * newFixedThreadPool
 * 创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
 */
//
/*
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        IntStream.range(0,5).forEach(i->executor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String threadName = Thread.currentThread().getName();
            System.out.println("finished "+threadName);
        }));
        try{
            executor.shutdown();
            executor.awaitTermination(5,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (!executor.isTerminated()){
                executor.shutdownNow();
            }
        }
    }
}
*/

/**
 * newCachedThreadPool,推荐使用这个
 * 这个是一个自动扩充的缓冲线程池;
 * executor.execute(()->{})  这函数就是new Runable() 实现了run接口
 *
 */

/*

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        IntStream.range(0,6).forEach(i->executor.execute(()->{
            try{
                TimeUnit.SECONDS.sleep(2);
                String threadName = Thread.currentThread().getName();
            System.out.println("finished "+ threadName);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }));
        try{
            executor.shutdown();
            executor.awaitTermination(5,TimeUnit.SECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            if (!executor.isTerminated()){
                executor.shutdownNow();
            }
        }
    }
}

*/

/**
 * new Runnable() 中的run是void不能接收返回值,这个就需要用callable
 */
//public class ExecutorDemo {
//    public static void main(String[] args) throws InterruptedException {
//        Set<Callable<String>> callables = new HashSet<Callable<String>>();
//        ExecutorService executor = Executors.newCachedThreadPool();
//        IntStream.range(0,6).forEach(i->callables.add(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "task"+ String.valueOf(i);
//            }
//        }));
//        List<Future<String>> futures = executor.invokeAll(callables);
//        executor.shutdown();
//        futures.forEach(future->{
//            try {
//                System.out.println(future.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//}
//






















