package com.gui.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-03-06.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        ServiceDemo serviceDemo = context.getBean(ServiceDemo.class);
        serviceDemo.outputResult();
        context.close();

    }
}
