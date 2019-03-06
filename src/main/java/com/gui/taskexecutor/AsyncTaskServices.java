package com.gui.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by guijianliang on 2019-03-06.
 */


@Service
public class AsyncTaskServices {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务:" + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1 "+ i);
    }
}
