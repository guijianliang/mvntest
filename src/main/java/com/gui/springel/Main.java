package com.gui.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-03-05.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ELConfig el = context.getBean(ELConfig.class);
        el.outputResource();
        context.close();
    }
}
