package com.gui.a.dongtaidaili;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by guijianliang on 2019-04-17.
 * 动态代理
 */


public class DynamicAgentDemo {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();

        //创建一个InvocationHandler，描述我们希望代理者执行哪些操作
        InvocationHandler invocationHandler = (InvocationHandler) new MyInvocationHandler(userDao);

        //通过刚才创建的InvocationHandler，创建真正的代理者。第一个参数是类加载器，
        // 第二个参数是这个代理者实现哪些接口(与被代理者实现的是相同的接口)
        // 这里必须先转换为类;
        IUserDao userDaoProxy = (IUserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(), invocationHandler);
        userDaoProxy.save();

    }
}
