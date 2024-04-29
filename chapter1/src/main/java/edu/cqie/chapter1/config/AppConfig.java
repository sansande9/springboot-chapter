package edu.cqie.chapter1.config;

import ch.qos.logback.core.encoder.ByteArrayUtil;
import edu.cqie.chapter1.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value = "prototype")
    public User user(){
       User user = new User();
       return user;
    }
    @Bean
    @Scope(value = "prototype")
    public ByteArrayUtil util(){
        ByteArrayUtil util = new ByteArrayUtil();
        return util;
    }
}
