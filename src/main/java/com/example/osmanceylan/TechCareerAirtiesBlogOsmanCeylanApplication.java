package com.example.osmanceylan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TechCareerAirtiesBlogOsmanCeylanApplication {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }


    public static void main(String[] args) {

        SpringApplication.run(TechCareerAirtiesBlogOsmanCeylanApplication.class, args);
    }

}
