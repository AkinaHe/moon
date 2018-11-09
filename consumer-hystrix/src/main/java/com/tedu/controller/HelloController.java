package com.tedu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.tedu.client.EurekaServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    EurekaServiceFeign eurekaServiceFeign;

    @GetMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "hellofallback")
    public String hello(@PathVariable String name){
        return eurekaServiceFeign.hello(name);
    }


    public String hellofallback(String name){
        return "default";
    }
}
