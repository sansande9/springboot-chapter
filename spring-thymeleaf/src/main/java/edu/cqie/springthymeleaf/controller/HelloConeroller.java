package edu.cqie.springthymeleaf.controller;
import edu.cqie.springthymeleaf.entity.Comment;
import edu.cqie.springthymeleaf.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloConeroller {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
