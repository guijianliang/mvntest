package com.gui.a.dongtaidaili.cglibdemo;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by guijianliang on 2019-04-18.
 */


public class UserDaoProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这个是cglib开始输出: " + System.currentTimeMillis());

        Object object = methodProxy.invokeSuper(o, objects);

        System.out.println("这个是cglib后面输出: " + System.currentTimeMillis());
        return object;
    }
}
