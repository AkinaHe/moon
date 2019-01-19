package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ConsumerHystrixApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerHystrixApplication.class, args);
    }

    public test(){

        //1



        //2


        //3



    }

}
