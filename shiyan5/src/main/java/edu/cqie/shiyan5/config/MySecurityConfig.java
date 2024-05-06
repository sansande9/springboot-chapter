package edu.cqie.shiyan5.config;

import edu.cqie.shiyan5.encoder.MyPasswordEncoder;
import edu.cqie.shiyan5.service.UserDetailsService;
import edu.cqie.shiyan5.service.impl.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
    @Bean
    public PasswordEncoder PasswordEncoder(){
        return new MyPasswordEncoder();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        return new MyUserDetailsService();
    }
    //注册Security过滤器链
    @Bean
    SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
        //配置用户认证(登录相关配置)
        security.formLogin(configurer -> {
            configurer
                    //配置登录页面地址
                    .loginPage("/user/login")
                    //配置登录请求处理地址（Post）
                    .loginProcessingUrl("/user/login")
                    //配置登录请求的用户名和密码参数
                    .usernameParameter("uname")
                    .passwordParameter("pwd")
                    //配置登录成功后默认跳转的页面
                    .defaultSuccessUrl("/user/main")
                    //配置登录失败后默认重定向的页面
                    .failureForwardUrl("/user/loginFail");
        });
        //配置用户退出
        security.logout(configurer -> {
            //配置退出请求处理地址
            configurer.logoutUrl("/user/logout");
        });
        //配置用户权限
        security.authorizeHttpRequests(registry -> {
            registry
                    //不需要认证的路径
                    .requestMatchers(
                            "/user/login",
                            "/img/**",
                            "/css/**",
                            "/user/loginFail").permitAll()
                    //除了上面的路径，其他请求都需要认证登录
                    .anyRequest().authenticated();
        });
        //配置CSRF防御
        security.csrf(configurer -> {
            configurer.disable();
        });
        return security.build();
    }
}
