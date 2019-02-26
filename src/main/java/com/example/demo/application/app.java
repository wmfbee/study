package com.example.demo.application;

import com.example.common.log.mylog;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class app implements mylog {
    @Override
    @Scheduled
    public void log() {
        System.out.println("my log");
    }
}

