package com.example.springsecurity_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springsecurity_demo1.mapper")
public class SpringSecurityDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemo1Application.class, args);
    }

}
