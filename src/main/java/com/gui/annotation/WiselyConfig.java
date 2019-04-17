package com.gui.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guijianliang on 2019-03-06.
 */




@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration //组合@Configuration 元注解
@ComponentScan //组合@CompontentScan 元注解
public @interface WiselyConfig {
    String[] value()default {}; //覆盖value参数
}
