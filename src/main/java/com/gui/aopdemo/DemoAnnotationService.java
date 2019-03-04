package com.gui.aopdemo;

import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-03-04.
 * 编写使用注解的被拦截类;
 */

@Service
public class DemoAnnotationService {
    @Action(name="注解shi拦截的add操作")
    public void add(){}
}
