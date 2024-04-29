package edu.cqie.shiyan2.config;

import edu.cqie.shiyan2.entity.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestMyConfig {
    @Bean
    public MyComponent dataBase(){
        MyComponent db = new MyComponent();
        db.setUrl("jdbc://192.168.0.0.1/db3");
        db.setUserName("test");
        db.setPassword("123456");
        return db;
    }
}
