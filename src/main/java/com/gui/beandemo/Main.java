package com.gui.beandemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-02-28.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Diconfig.class);
        UserFuncSrevice userFuncSrevice = context.getBean(UserFuncSrevice.class);
        userFuncSrevice.sayhelllo("nihao");

    }
}
