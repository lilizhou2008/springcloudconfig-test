package com.ocean.springcloud.oceanconfigserver1.valuetest;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 季超
 * @create 2018-03-15 9:36
 * @desc
 **/
@RestController
@RequestMapping("/test")
@Data
public class test {


//   @Value("${from}")
    private String from;

    @GetMapping("/test")
    public void test1(){
        System.out.println(from);
    }

}

