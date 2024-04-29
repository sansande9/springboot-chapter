package edu.cqie.shiyan2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UrlPathHelper;

@Configuration
public class AppConfig {
    @Bean
    public UrlPathHelper urlPathHelper(){
        return new UrlPathHelper();
    }
}
