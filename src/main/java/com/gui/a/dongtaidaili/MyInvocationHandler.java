package com.gui.a.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by guijianliang on 2019-04-17.
 * 动态代理
 */


public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    MyInvocationHandler(Object target) {
        this.target = target;
    }


    //然后是invoke的三个参数、第一个参数就是代理者，如果你想对代理者做一些操作可以使用这个参数；
    // 第二个就是被执行的方法，第三个是执行该方法所需的参数。
    //把我们想要通过代理者给被代理者追加的操作都写在invoke方法里面
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }
}
