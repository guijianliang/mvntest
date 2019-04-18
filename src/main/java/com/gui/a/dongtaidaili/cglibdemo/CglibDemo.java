package com.gui.a.dongtaidaili.cglibdemo;

import com.gui.a.dongtaidaili.UserDao;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by guijianliang on 2019-04-18.
 * JDK代理要求被代理的类必须实现接口，有很强的局限性。而CGLIB动态代理则没有此类强制性要求。
 * 简单的说，CGLIB会让生成的代理类继承被代理类，并在代理类中对代理方法进行强化处理(前置处理、后置处理等)。
 * 在CGLIB底层，其实是借助了ASM这个非常强大的Java字节码生成框架。
 */


public class CglibDemo {
    public static void main(String[] args) {
        // 1. 生成一个代理类的实例,后面加到增强方法上;
        UserDaoProxy userDaoProxy = new UserDaoProxy();
        // 2. 增强现实类;
        Enhancer enhancer = new Enhancer();
        // 3. 设置增强现实类要继承的类;
        enhancer.setSuperclass(UserDao.class);
        // 4. 设置增强显示类要回调的类(动态代理类);
        enhancer.setCallback(userDaoProxy);
        // 5. 创建动态代理类;
        UserDao userDao = (UserDao) enhancer.create();
        userDao.save();

    }
}
