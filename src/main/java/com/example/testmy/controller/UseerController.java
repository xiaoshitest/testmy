package com.example.testmy.controller;

import com.example.testmy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author ：ssy
 * @description：TODO
 * @date ：2021/7/3 17:41
 */
@RestController
@RequestMapping("/testBoot")
public class UseerController {

    @Scheduled(cron = "0/5 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        System.err.println("执行静态定时任务时间: " + LocalDateTime.now());
    }

//    @Autowired
//    public UserService userService;
//
//    @GetMapping
//    public List<Map<String,Object>> selectUser(){
//        return userService.selectUser();
//    }

}
