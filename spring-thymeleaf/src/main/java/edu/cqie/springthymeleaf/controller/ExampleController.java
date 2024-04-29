package edu.cqie.springthymeleaf.controller;

import edu.cqie.springthymeleaf.entity.Comment;
import edu.cqie.springthymeleaf.mapper.CommentMapper;
import edu.cqie.springthymeleaf.service.CommentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExampleController {
    @Resource
    private CommentService commentService;

    @RequestMapping("/example")
    public String allexample(Model model) {
        List<Comment> item = commentService.list();
        model.addAttribute("items",item);
        return "example";
    }
}
