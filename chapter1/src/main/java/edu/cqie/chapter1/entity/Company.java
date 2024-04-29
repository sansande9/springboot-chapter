package edu.cqie.chapter1.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@ToString

//@PropertySource("classpath:self.properties")
public class Company {
//   @Value("${company.name}")
    private String name;
//    @Value("${company.address}")
    private String address;
//    @Value("${company.post}")
    private String post;
}
