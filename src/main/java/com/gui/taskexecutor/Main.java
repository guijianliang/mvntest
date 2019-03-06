package com.gui.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by guijianliang on 2019-03-06.
 */


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskServices asyncTaskServices = context.getBean(AsyncTaskServices.class);
        for (int i=0;i<10;i++){
            asyncTaskServices.executeAsyncTask(i);
            asyncTaskServices.executorAsyncTaskPlus(i);
        }
        context.close();
    }
}
