package com.gui.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by guijianliang on 2019-03-06.
 */

@Configuration
@ComponentScan("com.gui.taskexecutor")
@EnableAsync //开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

    //实现AsyncConfigurer接口,并重写getAsyncExecutor,并返回一个threadpoolexecutor
    //这样就好得到一个基于线程池的TaskExecutor.
    @Override
    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;

    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}

