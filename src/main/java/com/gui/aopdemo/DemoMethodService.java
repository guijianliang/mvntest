package com.gui.aopdemo;

import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-03-04.
 * 编写使用方法规则被拦截类
 */



@Service
public class DemoMethodService {
    @Action(name = "heheh")
    public void add(){}
}
