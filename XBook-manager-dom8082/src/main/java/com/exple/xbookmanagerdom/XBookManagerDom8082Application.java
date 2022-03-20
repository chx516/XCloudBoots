package com.exple.xbookmanagerdom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.exple.controller","com.exple.dao","com.exple.pojo","com.exple.service"})
public class XBookManagerDom8082Application {

    public static void main(String[] args) {
        SpringApplication.run(XBookManagerDom8082Application.class, args);
    }

}
