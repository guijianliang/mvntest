package com.gui.aopdemo;

import java.lang.annotation.*;

/**
 * Created by guijianliang on 2019-03-04.
 * @Target(ElementType.TYPE)   //接口、类、枚举、注解
 * @Target(ElementType.FIELD) //字段、枚举的常量
 * @Target(ElementType.METHOD) //方法
 * @Target(ElementType.PARAMETER) //方法参数
 * @Target(ElementType.CONSTRUCTOR)  //构造函数
 * @Target(ElementType.LOCAL_VARIABLE)//局部变量
 * @Target(ElementType.ANNOTATION_TYPE)//注解
 * @Target(ElementType.PACKAGE) ///包   
 *  由以上的源码可以知道，他的elementType 可以有多个，一个注解可以为类的，方法的，字段的等等
 * 1.3、@Document：说明该注解将被包含在javadoc中
 * 1.1、@Retention: 定义注解的保留策略
 * @Retention(RetentionPolicy.SOURCE)   //注解仅存在于源码中，在class字节码文件中不包含
 * @Retention(RetentionPolicy.CLASS)     // 默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得，
 * @Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
 * ---------------------
 * 注解本身是没有功能的,就像xml,注解和xml都是元数据,元数据即解释数据的数据,这就是所谓的配置;
 * 注解的功能来自于用这个注解的地方
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() ;
}
