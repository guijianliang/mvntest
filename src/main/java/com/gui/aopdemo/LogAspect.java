package com.gui.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by guijianliang on 2019-03-04.
 */




@Aspect   //1. 声明一个切面
@Component //2. 让此切面成为spring管理的bean
public class LogAspect {
    @Pointcut("@annotation(com.gui.aopdemo.Action)") //3. 通过Pointcut声明切点;
    public void annotationPointCut(){};

    @After("annotationPointCut()") //4. 通过after声明一个建言,并使用@PointCut定义的切点;
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截:"+action.name()); //5. 通过拦截可以获取注解上的属性,然后做日志记录相关的操作;
    }

    //6. 通过before注解声明一个建言,此建言直接使用拦截规则作为参数;
    @Before("execution(*com.gui.aopdemo.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截:"+ method.getName());
    }




}
