package com.exple.xclientsshdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.exple.controller","com.exple.dao","com.exple.pojo","com.exple.service"})
public class XClientSshDom8081Application {

    public static void main(String[] args) {
        SpringApplication.run(XClientSshDom8081Application.class, args);
    }

}
