package com.zzt.demo.helloworld.Controller;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ServerTest {
    @GetMapping("time")
    public String getTime(){
        return DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss");
    }
}
