package com.gui.agentProxy;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by guijianliang on 2019-02-27.
 * 反射的原理就是通过映射类
 */


public class InvokeDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Method methods[] = Book.class.getMethods();
        Book book = new Book();
        methods[1].invoke(book,"java");
        System.out.println(methods[0].invoke(book));
        // invoke()里面传递的是两个一个是实例化的类,一个是参数;
    }

}


@Setter
@Getter
class Book{
    private String name;
    private Integer price;

}


