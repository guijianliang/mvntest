package com.gui.AspectJDemo;

/**
 * Created by guijianliang on 2019-02-28. 
 */


/**
 * 注意关键字:aspect
 */
public aspect MyAspectJDemo {

    /**
     * 定义切点,日志记录切点;
     */
    pointcut recordLog():call(* com.gui.AspectJDemo.HelloWorld.sayHello(..));

    /**
     * 定义切点,权限验证
     */
    pointcut authCheck():call(* com.gui.AspectJDemo.HelloWorld.sayHello(..));

    /**
     * 定义前置通知!
     */
    before():authCheck(){
        System.out.println("sayHello 之前定义的.");
    }

    after():recordLog(){
        System.out.println("sayHello 之后定义的.");
    }

}
