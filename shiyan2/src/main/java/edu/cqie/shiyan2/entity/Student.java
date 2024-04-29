package edu.cqie.shiyan2.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    public String name;
    public String stuno;
    public List<String> favorite;
    public Classs classs;
}
