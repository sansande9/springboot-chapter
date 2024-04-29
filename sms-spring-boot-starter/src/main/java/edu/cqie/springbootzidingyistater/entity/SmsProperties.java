package edu.cqie.springbootzidingyistater.entity;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "sms")
public class SmsProperties {
    private String host;
    private int password;
    private String username;

}
