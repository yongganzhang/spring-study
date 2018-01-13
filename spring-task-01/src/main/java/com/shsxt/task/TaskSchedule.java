package com.shsxt.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * 
 * @author Mr.YongGan.Zhang
 *
 */
@Component
public class TaskSchedule {

//	@Scheduled(cron="0/2 * * * * ?")
	public void job1() {
		System.out.println("任务1:" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
	}

	
//    @Scheduled(cron="0/5 * * * * ?")
    public void job2(){
        System.out.println("任务2:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }
}
