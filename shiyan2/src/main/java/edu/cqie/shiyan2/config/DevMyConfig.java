package edu.cqie.shiyan2.config;

import edu.cqie.shiyan2.entity.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevMyConfig {
    @Bean
    public MyComponent dataBase(){
        MyComponent db = new MyComponent();
        db.setUrl("jdbc://192.168.0.0.1/db1");
        db.setUserName("dev");
        db.setPassword("123456");
        return db;
    }
}
