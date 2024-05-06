package com.example.springsecurity_demo1.encoder;

import org.springframework.security.crypto.password.PasswordEncoder;


public class MyPasswordEncoder implements PasswordEncoder {
    @Override//加密
    public String encode(CharSequence rawPassword) {
        System.out.println("自定义密码加密器encode方法执行");
        return rawPassword.toString();
    }

    @Override//校验
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        System.out.println("自定义密码加密器matches方法执行");
        return encode(rawPassword).equals(encodedPassword);
    }
}
