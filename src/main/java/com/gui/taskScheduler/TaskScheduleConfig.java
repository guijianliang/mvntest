package com.gui.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by guijianliang on 2019-03-06.
 */

@Configuration
@ComponentScan("com.gui.taskScheduler")
@EnableScheduling //使用此注解来开启对计划任务的支持
public class TaskScheduleConfig {
}
