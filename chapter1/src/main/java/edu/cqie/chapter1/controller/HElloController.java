package edu.cqie.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HElloController {
@ResponseBody
    @GetMapping("/hello")
    public String Hello(){
    return "nihaonihao";
}
}
