package edu.cqie.chapter2;

import edu.cqie.chapter2.entity.Comment;
import edu.cqie.chapter2.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter2ApplicationTests {
@Autowired
private CommentMapper commentMapper;
    @Test
    void test1() {
        Comment comment = commentMapper.slectCommentById(1);
        System.out.println(comment);
    }
    @Test
    void test2(){
        Comment comment = new Comment();
        comment.setContent("1111");
        comment.setAuthor("lisi");
        comment.setAId(10);
        int i = commentMapper.insertComment(comment);
        System.out.println(i);
    }

    @Test
    void test3(){
        Comment comment = new Comment();
        comment.setContent("1111");
        comment.setAuthor("lisi");
        comment.setId(1);
        int i = commentMapper.updateComment(comment);
        System.out.println(i);
    }
}
