package com.gui.taskScheduler;

import com.gui.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-03-06.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);

    }
}
