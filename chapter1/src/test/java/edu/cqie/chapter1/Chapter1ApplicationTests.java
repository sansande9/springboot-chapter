package edu.cqie.chapter1;

import edu.cqie.chapter1.controller.TextController;
import edu.cqie.chapter1.entity.Company;
import edu.cqie.chapter1.entity.User;
import edu.cqie.chapter1.service.Userservice;
import edu.cqie.chapter1.service.impl.UserserviceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter1ApplicationTests {
@Autowired
private User user;
@Autowired
private UserserviceImpl userservice;
    @Test
   public void contextLoads() {
//        219970206高文志
        System.out.println(userservice.save());
        System.out.println(userservice.update());
    }
//@Test
//    public void company() {
//        System.out.println(user);
//    }
}
