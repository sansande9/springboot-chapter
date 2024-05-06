package com.example.springsecurity_demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityDemo1ApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));
        System.out.println(passwordEncoder.encode("123"));
        System.out.println(passwordEncoder.encode("123"));
        System.out.println(passwordEncoder.matches("123","$2a$10$GnsIdhHkeDEZBeKfVIUmaesfCUQkob8lWuM9XwqDmF2G6Mtc4hxDC"));
    }

}
