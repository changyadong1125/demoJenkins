package com.atguigu.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "现在北京时间是:\t"+simpleDateFormat.format(new Date());
    }
}