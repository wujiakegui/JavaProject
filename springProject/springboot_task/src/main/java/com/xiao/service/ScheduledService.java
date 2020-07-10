package com.xiao.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    // 在特定的时间执行
    @Scheduled(cron = "0 52 10 * * ?")
    public void timing(){
        System.out.println("可归，定时执行");
    }
}
