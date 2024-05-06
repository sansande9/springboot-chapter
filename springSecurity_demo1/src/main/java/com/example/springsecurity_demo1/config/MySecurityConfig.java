package com.example.springsecurity_demo1.config;

import com.example.springsecurity_demo1.encoder.MyPasswordEncoder;
import com.example.springsecurity_demo1.service.impl.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }
    @Bean
    SecurityFilterChain filterChain(HttpSecurity security) throws Exception{

        security.formLogin(configurer ->{
            configurer.loginPage("/user/login")//get跳转页面
                    .loginProcessingUrl("/user/login")//post请求
                    .defaultSuccessUrl("/user/main")
                    .successForwardUrl("/user/main")
                    .failureForwardUrl("/user/loginFail");
        });
        //配置用户退出
        security.logout(configurer ->{
            configurer.logoutUrl("/user/logout");
        });
        //配置用户基本权限
        security.authorizeHttpRequests(registry ->{
            registry.requestMatchers("/login","/user/login","/css/**","/img/**","/user/loginFail","/user/register").permitAll()//指定释放路径
                    .requestMatchers("/order/manage").hasAuthority("订单管理")
                    .requestMatchers("/shop/manage").hasAuthority("店铺管理")
                    .requestMatchers("/user/manage").hasAuthority("系统用户管理")
                    .anyRequest().authenticated();//其他都要认证
        });
        //关闭csrf防护
        security.csrf(configurer -> {
            configurer.disable();
        });
        return security.build();
    }
}
