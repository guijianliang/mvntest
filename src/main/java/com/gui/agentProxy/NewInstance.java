package com.gui.agentProxy;

/**
 * Created by guijianliang on 2019-02-27.
 * newInstance 只能调用无参构造方法;
 * new关键字生成对象没有这个限制;
 * Class.forName("")返回的是类
 * Class.forName("").newInstance()返回的是object
 */

public class NewInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 注意这里找的是ClassA.class文件
        Class clazz = Class.forName("com.gui.agentProxy.ClassA");
        Duang classA = (Duang) clazz.newInstance();
        System.out.println(classA.getName());
    }
}

interface Duang {
    String getName();
}

class ClassA implements Duang{
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}



