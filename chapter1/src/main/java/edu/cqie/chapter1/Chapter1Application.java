package edu.cqie.chapter1;

import ch.qos.logback.core.encoder.ByteArrayUtil;
import edu.cqie.chapter1.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Chapter1Application.class, args);
        ByteArrayUtil util = run.getBean(ByteArrayUtil.class);
        User bean =run.getBean(User.class);
        User bean2 =run.getBean(User.class);
        System.out.println(bean.hashCode());
        System.out.println(bean2.hashCode());
        System.out.println(bean==bean2);
        System.out.println(util);
    }

}
