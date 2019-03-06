package com.gui.taskScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guijianliang on 2019-03-06.
 */

@Service
public class ScheduleTaskServices {
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:ss:mm");

    @Scheduled(fixedRate = 5000) //每隔固定的时间执行
    public void reportCurrentTime(){
        System.out.println("每隔5s执行一次: "+ dataFormat.format(new Date()));
    }

    @Scheduled(cron="0 29 11 ? * *") //使用corn可以使用指定的时间运行
    public void fixedTime(){
        System.out.println("在固定的时间执行: "+ dataFormat.format(new Date())+"执行");
    }


}
