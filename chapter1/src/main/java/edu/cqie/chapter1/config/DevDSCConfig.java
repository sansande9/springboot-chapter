package edu.cqie.chapter1.config;

import edu.cqie.chapter1.entity.Datasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevDSCConfig {
    @Bean
    public Datasource datasource(){
        Datasource db = new Datasource();
        db.setUrl("jdbc://");
        db.setUsername("");
        db.setPassword("");
        return db;
    }
}
