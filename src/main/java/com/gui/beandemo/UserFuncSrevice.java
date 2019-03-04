package com.gui.beandemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-02-28.
 */

@Service
public class UserFuncSrevice {
    @Autowired
    FuncService funcService;

    public void sayhelllo(String s){
        funcService.sayHello();
    };
}
