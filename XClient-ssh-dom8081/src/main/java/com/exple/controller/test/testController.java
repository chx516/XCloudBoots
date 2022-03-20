package com.exple.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test.do")
    public String testDo()
    {
        return "Web Spring Boot Start Success!";

    }
}
