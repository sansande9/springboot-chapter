package edu.cqie.springthymeleaf.service;

import edu.cqie.springthymeleaf.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    Comment slectCommentById(int id);
    List<Comment> list();

}
