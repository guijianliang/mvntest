package com.gui.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-03-06.
 */

@Service
public class ServiceDemo {
    public void outputResult(){
        System.out.println("从组合注解照样获得配置");
    }
}
