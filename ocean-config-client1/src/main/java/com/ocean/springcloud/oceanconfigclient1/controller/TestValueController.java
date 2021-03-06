package com.ocean.springcloud.oceanconfigclient1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 季超
 * @create 2018-03-24 12:18
 * @desc
 **/

@RestController
@RefreshScope
@RequestMapping("/test")
public class TestValueController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestValueController.class);


    @Value("${from}")
    private String from;
//
//    public String getFrom() {
//        return from;
//    }
//
//    public void setFrom(String from) {
//        this.from = from;
//    }

    @GetMapping("/test")
    public String  test(){
        System.out.println(from);
        LOGGER.info("[是]: {}"+from);
        return from;
    }
}

