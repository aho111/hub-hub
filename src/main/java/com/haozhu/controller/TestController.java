/*
 *
 * 文件名称  :   TestController.java
 * 文件作者  :   李豪
 * 生成日期  :   2021/03/25 09:29
 * 功能描述  :   <<scription>>
 */
package com.haozhu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 李豪
 * @Date: 2021/03/25 09:29
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/name")
    public String getName(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String time = dateFormat.format(new Date());
        System.out.println("zhuangshan+time+:"+time);
        return "zhuangshan+time+:"+time;
    }
}
