package com.gui.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by guijianliang on 2019-03-04.
 */

@Configuration
@ComponentScan("com.gui.aopdemo")
@EnableAspectJAutoProxy
public class AopConfig  {
}
