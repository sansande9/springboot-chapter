package edu.cqie.shiyan2.config;

import edu.cqie.shiyan2.entity.MyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod" +
        "")
public class ProdMyConfig {
    @Bean
    public MyComponent dataBase(){
        MyComponent db = new MyComponent();
        db.setUrl("jdbc://192.168.0.0.1/db2");
        db.setUserName("prod");
        db.setPassword("123456");
        return db;
    }
}
