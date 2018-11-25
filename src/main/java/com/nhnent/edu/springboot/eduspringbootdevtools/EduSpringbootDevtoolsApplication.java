package com.nhnent.edu.springboot.eduspringbootdevtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
@SpringBootApplication
public class EduSpringbootDevtoolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduSpringbootDevtoolsApplication.class, args);
    }

    @GetMapping("/")
    public String hello(Map<String, Object> model) {
    	model.put("message", "Hi, Japan!!");
        return "hello";
    }


}
