package com.gui.singletonBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-03-04.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonBean s1 = context.getBean(DemoSingletonBean.class);
        DemoSingletonBean s2 = context.getBean(DemoSingletonBean.class);

        PrototypeDemo p1 = context.getBean(PrototypeDemo.class);
        PrototypeDemo p2 = context.getBean(PrototypeDemo.class);

        System.out.println("s1 与s2 是相等的:"+s1.equals(s2));
        System.out.println("p1 与p2 是相等的:"+p1.equals(p2));
    }
}
