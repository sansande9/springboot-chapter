package edu.cqie.springbootzidingyistater.config;

import edu.cqie.springbootzidingyistater.entity.SmsProperties;
import edu.cqie.springbootzidingyistater.service.SmsService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {
    @Bean
    public SmsService smsService() {
        return new SmsService();
    }
}
