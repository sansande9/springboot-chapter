package edu.cqie.shiyan2;

import edu.cqie.shiyan2.entity.MyComponent;
import edu.cqie.shiyan2.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Shiyan2ApplicationTests {
@Autowired
private MyComponent myComponent;
@Autowired
private Student student;
    @Test
    void contextLoads() {
        System.out.println("username:"+myComponent.getUserName()+"   password:"+myComponent.getPassword());
    }
    @Test
    public void StudentTest(){
        System.out.println(student.toString());
    }

}
