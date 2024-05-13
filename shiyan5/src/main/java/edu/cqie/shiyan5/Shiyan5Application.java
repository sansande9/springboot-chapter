package edu.cqie.shiyan5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.cqie.shiyan5.mapper")
public class Shiyan5Application {

    public static void main(String[] args) {
        SpringApplication.run(Shiyan5Application.class, args);
    }

}
