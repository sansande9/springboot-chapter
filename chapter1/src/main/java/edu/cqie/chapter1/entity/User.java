package edu.cqie.chapter1.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "user")
//@Component
public class User {
    private int id;
    private String name;
    private int age;
    private List<String> hobby;
    private Job job;
    private List<Pet> pets;
}
