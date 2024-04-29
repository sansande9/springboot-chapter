package edu.cqie.springthymeleaf.service.impl;

import edu.cqie.springthymeleaf.entity.Comment;
import edu.cqie.springthymeleaf.mapper.CommentMapper;
import edu.cqie.springthymeleaf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public Comment slectCommentById(int id) {
        return commentMapper.slectCommentById(1);
    }

    @Override
    public List<Comment> list() {
        return commentMapper.list();
    }
}
