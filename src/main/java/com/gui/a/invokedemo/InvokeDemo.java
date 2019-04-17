package com.gui.a.invokedemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by guijianliang on 2019-04-17.\
 * method.invoke(null,args)  如果method是静态方法,则不需要实例化的类,所有用null,如果不是静态方法,需要加上实例化的类
 * method.invoke(student,args) 如果method是非静态方法,则需要一个实例化的类,如student, args是该方法需要的 实参;
 */


public class InvokeDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //使用动态代理
        Class cl = Class.forName("com.gui.a.invokedemo.Student");
        //System.out.println(cl);
        //因为有些方法不是静态的,需要生产实例化,实例化对象
        Object o = cl.newInstance();

        //使用Method反射方法,获取所有的方法?
        Method[] methods = cl.getMethods();

        //1. 获取某一个方法:driving(String s),如果该方法需要传参,则需要后面加上该形参的类型;
        Method method_driving = cl.getMethod("driving",String.class);
        //如果不是静态方法,则需要传 o (实例化的对象)
        System.out.println(method_driving.invoke(o,"heshui")); //喝水: heshui

        //2. 获取某一个方法:static void run(String s), 1.静态; 2.有参数
        Method method_run = cl.getMethod("run",String.class);
        //因为是静态,obj直接传null就行
        System.out.println(method_run.invoke(null,"123")); //123

        //3. 获取一个方法:void eat() ,1.非静态; 2.无参;
        //因为是无参方法,直接传null
        Method method_eat = cl.getMethod("eat",null);
        // 1.因为是静态的需要传o, 2.因为是无参的,实参就传null
        System.out.println(method_eat.invoke(o,null));



    }
}
